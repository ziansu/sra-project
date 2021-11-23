private static void distributeFiles(java.lang.String tmpPath, org.apache.flink.api.java.ExecutionEnvironment env) throws java.io.IOException, java.net.URISyntaxException {
    org.apache.flink.python.api.PythonPlanBinder.clearPath(org.apache.flink.python.api.PythonPlanBinder.FLINK_HDFS_PATH);
    org.apache.flink.runtime.filecache.FileCache.copy(new org.apache.flink.core.fs.Path(tmpPath), new org.apache.flink.core.fs.Path(org.apache.flink.python.api.PythonPlanBinder.FLINK_HDFS_PATH), true);
    env.registerCachedFile(org.apache.flink.python.api.PythonPlanBinder.FLINK_HDFS_PATH, org.apache.flink.python.api.PythonPlanBinder.FLINK_PYTHON_DC_ID);
    org.apache.flink.python.api.PythonPlanBinder.clearPath(tmpPath);
}