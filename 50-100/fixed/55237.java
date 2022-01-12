public void run() {
    for (int i = 0; i < (messages.length); ++i) {
        synchronized(toWait) {
            try {
                toWait.wait();
                java.lang.System.out.println(messages[i]);
            } catch (java.lang.InterruptedException e) {
                java.lang.System.err.println("Oh, Why!");
            }
        }
        synchronized(toNotify) {
            toNotify.notify();
            OrderedOperationThreadMultiLock.printThreadsStatus();
        }
    }
}