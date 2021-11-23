public void configure(JobConf job) {
    n = job.getInt("n", 1);
    org.apache.hadoop.fs.Path queryFile = new org.apache.hadoop.fs.Path();
    try {
        org.apache.hadoop.fs.Path[] cacheFiles = org.apache.hadoop.filecache.DistributedCache.getLocalCacheFiles(job);
        if ((cacheFiles.length) > 0) {
            queryFile = cacheFiles[0];
        }
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println(("Caught exception while getting cached files: " + (StringUtils.stringifyException(ioe))));
    }
    parseQueryFile(queryFile, n);
}