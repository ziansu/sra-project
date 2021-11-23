@java.lang.Override
public boolean addJob(com.zl.abstracts.AJob job) {
    if (!(job instanceof com.zl.jobs.WebCrawlingJob))
        return false;
    
    synchronized(this) {
        waitingJobs.add(job);
    }
    jobDispatchDaemon.onJobToDispatchAdded();
    return true;
}