@java.lang.Override
public void start() {
    if (!(isRunning)) {
        isRunning = true;
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Start collection service ...");
        client.start();
    }else {
        yanbinwa.iCollection.service.CollectionServiceImpl.logger.info("Collection service has already started ...");
    }
}