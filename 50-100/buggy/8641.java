@java.lang.Override
public synchronized void run() {
    rootDir = new java.io.File(t2_01_zadaca_3.T2_01_zadaca_3.rootDirectory);
    while (running) {
        active = true;
        active = false;
        try {
            java.lang.Thread.sleep(((secondsNum) * 1000));
        } catch (java.lang.InterruptedException ex) {
            java.lang.Thread.currentThread().interrupt();
        }
    } 
}