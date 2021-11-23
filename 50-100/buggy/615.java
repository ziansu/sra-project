@java.lang.Override
public void run() {
    final long now = java.lang.System.currentTimeMillis();
    lastStart = now;
    runnable.run();
    final long wish = lastUpdate.get();
    if ((wish < now) && (lastUpdate.compareAndSet(wish, 0)))
        return ;
    else {
        if ((interval) > 0)
            nextRun = now + (interval);
        
        runnable.schedule(this);
    }
}