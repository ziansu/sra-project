public com.kylinolap.job2.execution.ExecutableStatus getJobStatus(java.lang.String uuid) {
    try {
        return com.kylinolap.job2.execution.ExecutableStatus.valueOf(jobDao.getJobOutput(uuid).getStatus());
    } catch (com.kylinolap.job2.exception.PersistentException e) {
        com.kylinolap.job2.service.DefaultJobService.logger.error(("fail to get job output:" + uuid), e);
        throw new java.lang.RuntimeException(e);
    }
}