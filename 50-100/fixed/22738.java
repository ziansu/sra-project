private void createPersistentFolders() {
    JobTracker.createOnePersistentFolder(JobTracker.JOBS_PATH, null);
    JobTracker.createOnePersistentFolder(JobTracker.SEQ_PATH, "1");
    JobTracker.createOnePersistentFolder(JobTracker.WORKER_PATH, null);
    JobTracker.createOnePersistentFolder(JobTracker.RESULT_PATH, null);
    JobTracker.createOnePersistentFolder(JobTracker.JOBPOOL_PATH, "1");
}