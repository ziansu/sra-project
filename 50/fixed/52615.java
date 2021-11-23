private void jumpTo(final long time) {
    synchronized(clock) {
        clock.stop();
        clock.setTime(time);
    }
}