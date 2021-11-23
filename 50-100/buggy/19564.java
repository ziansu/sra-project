@java.lang.Override
public void run() {
    for (int i = 0; i < (messages.length); ++i) {
        java.lang.System.out.println(messages[i]);
        synchronized(this) {
            try {
                wait();
                OrderedOperationThreadSingleLock.printThreadsStatus();
            } catch (java.lang.InterruptedException e) {
                java.lang.System.err.println("Oh, Why?");
            }
        }
        wakeUpNext();
    }
}