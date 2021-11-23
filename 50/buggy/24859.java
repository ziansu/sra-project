public boolean moveJobToWaitingStatus(com.zl.abstracts.AJob job) {
    if (!(job instanceof com.zl.jobs.WebCrawlingJob))
        return false;
    
    synchronized(this) {
        runningJobs.remove(job);
        waitingJobs.add(job);
    }
    jobDispatchDaemon.onJobToDispatchAdded();
    return true;
}