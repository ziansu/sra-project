private com.sos.jitl.reporting.db.DBItemInventoryJob jobExists(java.lang.String jobName) {
    for (com.sos.jitl.reporting.db.DBItemInventoryJob job : dbJobs) {
        if (jobName.equalsIgnoreCase(job.getName())) {
            return job;
        }else {
            continue;
        }
    }
    return null;
}