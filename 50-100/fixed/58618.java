@java.lang.Override
public void run() {
    for (int i = 0; i < (messages.length); ++i) {
        java.lang.Thread curThread = java.lang.Thread.currentThread();
        synchronized(curThread) {
            try {
                curThread.wait();
                java.lang.System.out.println(messages[i]);
            } catch (java.lang.InterruptedException e) {
                java.lang.System.err.println("Oh, Why?");
            }
        }
        wakeUpNext();
    }
}