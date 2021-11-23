public boolean resume() {
    if ((scheduler) == null)
        return false;
    
    boolean doSchedule = false;
    doSchedule = (!(done)) && (running.compareAndSet(false, true));
    if (doSchedule) {
        if ((preferredResumeThread) == (-1))
            scheduler.schedule(this);
        else
            scheduler.schedule(preferredResumeThread, this);
        
    }
    return doSchedule;
}