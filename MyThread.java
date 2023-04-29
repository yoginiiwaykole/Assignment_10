public class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running.");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // start the thread

        // use some thread methods
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread state: " + thread.getState());
        System.out.println("Thread is alive: " + thread.isAlive());
    }
}
