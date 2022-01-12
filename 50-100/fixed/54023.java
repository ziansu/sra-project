@java.lang.Override
public void nextTuple() {
    storm.utils.AbstractClientSpout.Request req;
    try {
        req = pendingRequests.poll(1, java.util.concurrent.TimeUnit.SECONDS);
        if (req == null)
            return ;
        
        collector.emit(new backtype.storm.tuple.Values(req.origin, req.id, req.content));
    } catch (java.lang.InterruptedException e) {
        log.error("Polling interrrupted", e);
    }
}