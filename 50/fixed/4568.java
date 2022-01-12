public boolean moveJobToRunningStatus(com.zl.abstracts.AJob job) {
    if (!(job instanceof com.zl.jobs.WebCrawlingJob))
        return false;
    
    waitingJobs.remove(job);
    runningJobs.add(job);
    return true;
}