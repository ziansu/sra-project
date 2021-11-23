@java.lang.Override
public void run() {
    int count = 0;
    java.lang.System.out.println((((java.lang.Thread.currentThread().getName()) + " Start. Command = ") + (command)));
    processCommand();
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(((java.lang.Thread.currentThread().getName()) + " End."));
    count++;
}