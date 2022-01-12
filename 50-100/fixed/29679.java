private void stopAtOnce(java.lang.String jobName, com.vip.saturn.job.console.repository.zookeeper.CuratorRepository.CuratorFrameworkOp curatorFrameworkOp) throws com.vip.saturn.job.console.exception.SaturnJobConsoleHttpException {
    java.util.Collection<com.vip.saturn.job.console.service.impl.JobServer> servers = jobDimensionService.getServers(jobName, curatorFrameworkOp);
    if (org.springframework.util.CollectionUtils.isEmpty(servers)) {
        throw new com.vip.saturn.job.console.exception.SaturnJobConsoleHttpException(HttpStatus.BAD_REQUEST.value(), com.vip.saturn.job.console.service.impl.RestApiServiceImpl.NO_EXECUTOR_FOUND);
    }
    for (com.vip.saturn.job.console.service.impl.JobServer server : servers) {
        com.vip.saturn.job.console.service.impl.RestApiServiceImpl.logger.info("stop at once: job:{} executor:{}", jobName, server.getExecutorName());
        jobOperationService.stopAtOnceByJobnameAndExecutorName(jobName, server.getExecutorName(), curatorFrameworkOp);
    }
}