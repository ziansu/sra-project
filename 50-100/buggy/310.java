@java.lang.Override
public void open(org.apache.flink.configuration.Configuration parameters) throws java.lang.Exception {
    super.open(parameters);
    if ((pool) == null) {
        org.apache.flink.contrib.streaming.MultiThreadedFlatMapFunction.LOG.debug("Initializing thread pool with {} threads", poolSize);
        collector = null;
        freeThread = poolSize;
        udfIdCnt = 0;
        restoring = false;
        idsInFlight = new java.util.HashMap<>(poolSize);
        pool = java.util.concurrent.Executors.newFixedThreadPool(poolSize);
        poolWatcher = new java.util.concurrent.ExecutorCompletionService<>(pool);
    }
}