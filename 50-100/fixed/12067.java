public static java.lang.String getJobCoordinationZkPath(org.apache.samza.config.Config config) {
    org.apache.samza.config.JobConfig jobConfig = new org.apache.samza.config.JobConfig(config);
    java.lang.String appId = new org.apache.samza.config.ApplicationConfig(config).getGlobalAppId();
    java.lang.String jobName = (jobConfig.getName().isDefined()) ? jobConfig.getName().get() : org.apache.samza.zk.ZkJobCoordinatorFactory.DEFAULT_JOB_NAME;
    java.lang.String jobId = (jobConfig.getJobId().isDefined()) ? jobConfig.getJobId().get() : org.apache.samza.zk.ZkJobCoordinatorFactory.DEFAULT_JOB_ID;
    return java.lang.String.format(org.apache.samza.zk.ZkJobCoordinatorFactory.JOB_COORDINATOR_ZK_PATH_FORMAT, appId, jobName, jobId);
}