public boolean moveJobToWaitingStatus(com.zl.abstracts.AJob job) {
    if (!(job instanceof com.zl.jobs.WebCrawlingJob))
        return false;
    
    runningJobs.remove(job);
    waitingJobs.add(job);
    jobDispatchDaemon.onJobToDispatchAdded();
    return true;
}