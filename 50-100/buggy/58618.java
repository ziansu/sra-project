@java.lang.Override
public void run() {
    for (int i = 0; i < (messages.length); ++i) {
        java.lang.System.out.println(messages[i]);
        java.lang.Thread curThread = java.lang.Thread.currentThread();
        synchronized(curThread) {
            try {
                curThread.wait();
                OrderedOperationThreadOneLock.printThreadsStatus();
            } catch (java.lang.InterruptedException e) {
                java.lang.System.err.println("Oh, Why?");
            }
        }
        wakeUpNext();
    }
}