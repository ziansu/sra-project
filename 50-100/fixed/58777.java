public void configure(JobConf job) {
    n = job.getInt("n", 1);
    try {
        org.apache.hadoop.fs.Path[] cacheFiles = org.apache.hadoop.filecache.DistributedCache.getLocalCacheFiles(job);
        if ((cacheFiles.length) > 0) {
            parseQueryFile(cacheFiles[0], n);
        }
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println(("Caught exception while getting cached files: " + (StringUtils.stringifyException(ioe))));
    }
}