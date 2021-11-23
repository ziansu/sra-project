@java.lang.Override
public void stop() {
    if (isRunning) {
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Stop collection service ...");
        client.stop();
        isRunning = false;
    }else {
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Collection service has already stopped ...");
    }
}