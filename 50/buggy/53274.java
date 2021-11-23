public final void startAt(long milisDelay) {
    start();
    startTime = ((java.lang.System.nanoTime()) / 1000000) + milisDelay;
}