private boolean step_100_startIngestJobs() {
    if (this.hasError()) {
        return false;
    }
    for (edu.harvard.iq.dataverse.DataFile df : finalFileList) {
        setNewlyAddedFile(df);
        break;
    }
    finalFileList.clear();
    msg("pre ingest start");
    ingestService.startIngestJobs(dataset, dvRequest.getAuthenticatedUser());
    msg("post ingest start");
    return true;
}