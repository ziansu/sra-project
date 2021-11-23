public void start() {
    logger.info(("isRvfWorker instance:" + (isWorker)));
    if (isWorker) {
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                consumeMessage();
            }
        });
        thread.start();
        org.ihtsdo.rvf.messaging.RvfValidationMessageConsumer.timeStart = java.util.Calendar.getInstance().getTimeInMillis();
        logger.info(("RvfWorker instance started at:" + (java.util.Calendar.getInstance().getTime())));
    }
}