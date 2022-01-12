@java.lang.Override
public void run() {
    record = new io.deepstream.Record("recordA", new java.util.HashMap(), connectionMock, config, deepstreamClientMock, new java.util.concurrent.locks.ReentrantLock());
    record.addRecordEventsListener(recordEventsListener);
    record.start();
}