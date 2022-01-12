@java.lang.Override
public void close() throws java.lang.Exception {
    logRecordHandler.close();
    inboundObserverCompletion.get();
    for (java.util.logging.Logger logger : configuredLoggers) {
        logger.setLevel(null);
    }
    configuredLoggers.clear();
    java.util.logging.LogManager.getLogManager().readConfiguration();
    channel.shutdown();
    if (!(channel.awaitTermination(10, java.util.concurrent.TimeUnit.SECONDS))) {
        channel.shutdownNow();
    }
}