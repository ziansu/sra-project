@java.lang.Override
public void run() {
    gameThread.start();
    connectionThread.start();
    try {
        gameThread.join();
    } catch (java.lang.InterruptedException ex) {
    }
    checker.setIsGameRunning(false);
}