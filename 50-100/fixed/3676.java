public long importHeritrixCrawl(java.lang.String jobName, java.lang.Long crawlSeriesId) {
    long crawlId;
    try (bamboo.core.Db db = dbPool.take()) {
        crawlId = db.createCrawl(jobName, crawlSeriesId, Db.IMPORTING);
    }
    taskmaster.startImporting();
    return crawlId;
}