public void toExecute(org.quartz.JobExecutionContext ctx) throws org.quartz.JobExecutionException {
    org.candlepin.pinsetter.tasks.ExpiredPoolsJob.log.info("Executing ExpiredPoolsJob");
    poolManager.cleanupExpiredPools();
}