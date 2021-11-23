private void cleanUpWorkingDirectory() {
    org.apache.hadoop.fs.Path mrJobDir = new org.apache.hadoop.fs.Path(this.jobProps.getProperty(ConfigurationKeys.MR_JOB_ROOT_DIR_KEY), this.jobContext.getJobName());
    try {
        if (this.fs.exists(mrJobDir)) {
            this.fs.delete(mrJobDir, true);
            gobblin.runtime.mapreduce.MRJobLauncher.LOG.info(("Deleted working directory " + mrJobDir));
        }
    } catch (java.io.IOException ioe) {
        gobblin.runtime.mapreduce.MRJobLauncher.LOG.error(("Failed to delete working directory " + mrJobDir));
    }
}