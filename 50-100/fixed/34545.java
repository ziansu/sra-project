private void cleanUpWorkingDirectory() {
    try {
        if (this.fs.exists(this.mrJobDir)) {
            this.fs.delete(this.mrJobDir, true);
            gobblin.runtime.mapreduce.MRJobLauncher.LOG.info(("Deleted working directory " + (this.mrJobDir)));
        }
    } catch (java.io.IOException ioe) {
        gobblin.runtime.mapreduce.MRJobLauncher.LOG.error(("Failed to delete working directory " + (this.mrJobDir)));
    }
}