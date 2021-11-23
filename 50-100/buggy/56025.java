@java.lang.Override
public void changed(com.couchbase.lite.replicator.EventType type, java.lang.Object o, java.util.concurrent.BlockingQueue queue) {
    if ((type == (EventType.PUT)) || (type == (EventType.ADD))) {
        if (isContinuous()) {
            if (!(queue.isEmpty())) {
                fireTrigger(ReplicationTrigger.RESUME);
                new java.lang.Thread(new java.lang.Runnable() {
                    @java.lang.Override
                    public void run() {
                        waitForPendingFutures();
                    }
                }).start();
            }
        }
    }
}