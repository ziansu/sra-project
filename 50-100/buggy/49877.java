synchronized void setProcessingStage(org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJob.Stage newStage) {
    if (((org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJob.Stage.CANCELLING) == (this.stage)) && ((org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJob.Stage.COMPLETED) != newStage)) {
        return ;
    }
    this.stage = newStage;
    this.stageStartDate = java.util.Date.from(java.time.Instant.now());
}