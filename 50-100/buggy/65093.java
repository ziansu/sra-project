private void updateJob(java.lang.String jobId, hoot.services.job.JobStatusManager.JOB_STATUS jobStatus, java.lang.String statusDetail) {
    try {
        boolean isComplete = jobStatus != (hoot.services.job.JobStatusManager.JOB_STATUS.RUNNING);
        updateJobStatus(jobId, jobStatus.ordinal(), isComplete, statusDetail);
    } catch (java.lang.Exception e) {
        hoot.services.job.JobStatusManager.logger.error("Failed to update job status of job with ID = {} and status detail = {}", jobId, statusDetail, e);
        throw e;
    }
}