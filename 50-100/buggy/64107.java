public void postProcess() throws java.lang.Exception {
    edu.unc.ceccr.chembench.taskObjects.CreateDatasetTask.logger.debug((((("User: " + (userName)) + "Job: ") + (jobName)) + " Saving dataset to database"));
    if (jobList.equals(Constants.LSF)) {
    }
    if (dataset.canGenerateModi()) {
        step = edu.unc.ceccr.chembench.global.Constants.MODI;
        dataset.generateModi();
    }
    dataset.setHasBeenViewed(Constants.NO);
    dataset.setJobCompleted(Constants.YES);
    dataset.setAvailableDescriptors(availableDescriptors);
    datasetRepository.save(dataset);
}