@java.lang.Override
public void run() {
    org.wso2.carbon.analytics.spark.core.internal.SparkBackendExecutor.log.info(("Starting executor using args : " + (java.util.Arrays.toString(argArray))));
    org.apache.spark.executor.CoarseGrainedExecutorBackend.main(argArray);
}