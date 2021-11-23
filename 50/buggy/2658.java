@java.lang.Override
protected void doExecute(org.quartz.JobExecutionContext context) throws java.lang.Exception {
    org.apache.commons.lang3.time.StopWatch sw = org.apache.commons.lang3.time.StopWatch.createStarted();
    datex2DataService.handleUnhandledDatex2Messages();
    sw.stop();
    log.info("Handle unhandled Datex2 messages took: {} ms", sw.getTime());
}