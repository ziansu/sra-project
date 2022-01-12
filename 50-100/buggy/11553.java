public synchronized void advance(long duration, java.util.concurrent.TimeUnit unit) {
    if (duration <= 0)
        throw new java.lang.IllegalArgumentException(("Duration must be positive; was " + duration));
    
    this.nanos += unit.toNanos(duration);
    for (; ;) {
        co.paralleluniverse.vtime.ManualClock.Scheduled s = waiters.peek();
        if ((s == null) || ((s.deadline) < (nanos)))
            break;
        
        waiters.poll().wakeup();
    }
}