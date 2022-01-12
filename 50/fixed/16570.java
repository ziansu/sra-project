public synchronized void waitForSignal() throws java.lang.InterruptedException {
    while (!(signalled)) {
        wait();
    } 
}