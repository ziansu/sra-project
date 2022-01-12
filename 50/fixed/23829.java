@java.lang.Override
public void stop() {
    if (isRunning) {
        isRunning = false;
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Stop collection service ...");
        client.stop();
    }else {
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Collection service has already stopped ...");
    }
}