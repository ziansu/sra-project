@java.lang.Override
public void setup(org.apache.giraph.graph.Context context) throws java.io.IOException, java.lang.InterruptedException {
    graphTaskManager = new org.apache.giraph.graph.GraphTaskManager<I, V, E>(context);
    graphTaskManager.setup(org.apache.hadoop.filecache.DistributedCache.getLocalCacheArchives(context.getConfiguration()));
    java.lang.Thread.setDefaultUncaughtExceptionHandler(graphTaskManager.createUncaughtExceptionHandler());
}