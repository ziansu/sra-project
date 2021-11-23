public static void startOnMiniCluster(org.apache.flink.runtime.jobgraph.JobGraph jobGraph, int parallelism, long memorySize) throws java.lang.Exception {
    org.apache.flink.configuration.Configuration configuration = jobGraph.getJobConfiguration();
    configuration.setLong(ConfigConstants.TASK_MANAGER_MEMORY_SIZE_KEY, memorySize);
    configuration.setInteger(ConfigConstants.TASK_MANAGER_NUM_TASK_SLOTS, parallelism);
    if (org.apache.flink.streaming.util.ClusterUtil.LOG.isInfoEnabled()) {
        org.apache.flink.streaming.util.ClusterUtil.LOG.info("Running on mini cluster");
    }
    try {
        org.apache.flink.streaming.util.ClusterUtil.exec = new org.apache.flink.runtime.minicluster.LocalFlinkMiniCluster(configuration, true);
        org.apache.flink.streaming.util.ClusterUtil.exec.submitJobDetached(jobGraph);
    } catch (java.lang.Exception e) {
        throw e;
    }
}