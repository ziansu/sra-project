protected void init() throws org.ebayopensource.winder.WinderScheduleException {
    org.ebayopensource.winder.WinderSchedulerManager schedulerManager = engine.getSchedulerManager();
    jobDetail = schedulerManager.getJobDetail(jobContext.getJobId());
    jobMetadata = engine.getStepRegistry().getMetadata(jobClass);
    taskInput = ((TI) (jobDetail.getInput()));
    taskResult = ((TR) (jobDetail.getResult()));
}