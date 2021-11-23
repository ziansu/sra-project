synchronized void setProcessingStage(org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJob.Stage newStage, java.util.Date stageStartDate) {
    if (((org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJob.Stage.CANCELLING) == (this.stage)) && ((org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJob.Stage.COMPLETED) != newStage)) {
        return ;
    }
    this.stage = newStage;
    this.stageStartDate = stageStartDate;
}