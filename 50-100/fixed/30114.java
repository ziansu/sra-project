protected void init() throws org.ebayopensource.winder.WinderScheduleException {
    jobDetail = jobContext.getJobDetail();
    jobMetadata = engine.getStepRegistry().getMetadata(jobClass);
    taskInput = ((TI) (jobDetail.getInput()));
    taskResult = ((TR) (jobDetail.getResult()));
}