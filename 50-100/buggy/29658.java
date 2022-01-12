@java.lang.Override
public void call(com.vip.saturn.job.console.repository.zookeeper.CuratorRepository.CuratorFrameworkOp curatorFrameworkOp) throws com.vip.saturn.job.console.exception.SaturnJobConsoleException {
    try {
        if (curatorFrameworkOp.checkExists(com.vip.saturn.job.console.utils.JobNodePath.getServerNodePath(jobName, executorName))) {
            throw new com.vip.saturn.job.console.exception.SaturnJobConsoleHttpException(HttpStatus.NOT_FOUND.value(), java.lang.String.format("The executor {%s} does not exists.", executorName));
        }
        reportAlarmService.raise(namespace, jobName, executorName, shardItem, alarmInfo);
    } catch (com.vip.saturn.job.integrate.exception.ReportAlarmException e) {
        throw new com.vip.saturn.job.console.exception.SaturnJobConsoleHttpException(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }
}