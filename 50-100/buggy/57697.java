public com.kylinolap.job2.execution.ExecutableStatus getJobStatus(java.lang.String uuid) {
    try {
        com.kylinolap.job2.dao.JobOutputPO jobOutput = jobDao.getJobOutput(uuid);
        if (jobOutput == null) {
            return com.kylinolap.job2.execution.ExecutableStatus.READY;
        }else {
            return com.kylinolap.job2.execution.ExecutableStatus.valueOf(jobOutput.getStatus());
        }
    } catch (com.kylinolap.job2.exception.PersistentException e) {
        com.kylinolap.job2.service.DefaultJobService.logger.error(("fail to get job output:" + uuid), e);
        throw new java.lang.RuntimeException(e);
    }
}