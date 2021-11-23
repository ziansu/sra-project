public boolean resume() {
    if ((scheduler) == null)
        return false;
    
    boolean doSchedule = false;
    if ((done) || (running.get()))
        return false;
    
    doSchedule = true;
    running.compareAndSet(false, true);
    if (doSchedule) {
        if ((preferredResumeThread) == (-1))
            scheduler.schedule(this);
        else
            scheduler.schedule(preferredResumeThread, this);
        
    }
    return doSchedule;
}