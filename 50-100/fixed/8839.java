private void updateJobOutput(java.lang.String uuid, com.kylinolap.job2.dao.JobOutputPO output) {
    try {
        jobDao.addOrUpdateJobOutput(uuid, output);
    } catch (com.kylinolap.job2.exception.PersistentException e) {
        com.kylinolap.job2.service.DefaultJobService.logger.error(("fail to update job output id:" + uuid), e);
        throw new java.lang.RuntimeException(e);
    }
}