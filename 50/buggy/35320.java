public io.codekvast.javaagent.scheduler.Scheduler start() {
    executor.scheduleAtFixedRate(this, 0L, 10L, java.util.concurrent.TimeUnit.SECONDS);
    log.info(("Scheduler started; pulling dynamic config from " + (config.getServerUrl())));
    return this;
}