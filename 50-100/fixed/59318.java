void scheduleTimer(long r, long id, long delay) {
    if ((r > 0) && (r < (java.lang.Long.MAX_VALUE))) {
        timer.set(worker.schedule(new TimerAction(id), delay, unit));
    }
}