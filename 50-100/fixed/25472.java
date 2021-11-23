@java.lang.Override
@org.springframework.scheduling.annotation.Async
public java.util.concurrent.Future<java.lang.Boolean> loadRandomRecords(long count) {
    try {
        beforeLoad();
        lastKnownStatus = "Loading...";
        indexABunchOfRandomData(java.lang.Long.valueOf(count));
        com.activebeancoders.fitness.data.service.AllDataLoaderWorker.log.info((("Data reload complete.  Loaded " + count) + " records."));
        lastKnownStatus = ("Data reload complete.  Loaded " + count) + " records.";
        return new org.springframework.scheduling.annotation.AsyncResult(true);
    } catch (java.lang.Exception e) {
        com.activebeancoders.fitness.data.service.AllDataLoaderWorker.log.error("Failed to reload data.", e);
        lastKnownStatus = "Failed to reload data";
        return new org.springframework.scheduling.annotation.AsyncResult(false);
    } finally {
        afterLoad();
    }
}