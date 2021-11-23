public void start() {
    logger.info(("isRvfWorker instance:" + (isWorker)));
    org.ihtsdo.rvf.messaging.RvfValidationMessageConsumer.timeStart = java.util.Calendar.getInstance().getTimeInMillis();
    if (isWorker) {
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                consumeMessage();
            }
        });
        thread.start();
        logger.info(("RvfWorker instance started at:" + (java.util.Calendar.getInstance().getTime())));
    }
}