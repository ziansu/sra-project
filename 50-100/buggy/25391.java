public void waitForFxThread(java.util.concurrent.atomic.AtomicBoolean isFinished) {
    while (!(isFinished.get())) {
        try {
            synchronized(this) {
                java.lang.System.out.println("Waiting...");
                wait(50);
            }
        } catch (java.lang.InterruptedException ex) {
            java.lang.System.out.println(ex.toString());
        }
    } 
}