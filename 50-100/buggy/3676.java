public long importHeritrixCrawl(java.lang.String jobName, java.lang.Long crawlSeriesId) {
    bamboo.io.HeritrixJob job = bamboo.io.HeritrixJob.byName(config.getHeritrixJobs(), jobName);
    long crawlId;
    try (bamboo.core.Db db = dbPool.take()) {
        crawlId = db.createCrawl(jobName, crawlSeriesId, Db.IMPORTING);
    }
    taskmaster.startImporting();
    return crawlId;
}