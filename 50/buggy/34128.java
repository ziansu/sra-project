public void continueRunning() {
    running = true;
    startTime = java.lang.System.nanoTime();
    endTime = startTime;
    run();
}