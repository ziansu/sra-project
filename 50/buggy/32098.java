@java.lang.Override
public java.util.List<arc.nim.crawler.common.job.Job> getAllJobs(java.lang.Integer offset, java.lang.Integer limit) {
    return new java.util.ArrayList(jobService.getAllJobs(offset, limit));
}