private java.lang.String getJobVersion(java.lang.String jobName, java.lang.String serverIp, com.vip.saturn.job.console.repository.zookeeper.CuratorRepository.CuratorFrameworkOp curatorFrameworkOp) {
    java.lang.String jobVersion = curatorFrameworkOp.getData(com.vip.saturn.job.console.service.impl.JobNodePath.getServerNodePath(jobName, serverIp, "jobVersion"));
    return jobVersion == null ? "" : jobVersion;
}