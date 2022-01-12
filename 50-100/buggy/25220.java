public boolean await(org.araqne.logdb.client.LogDbClient.QueuedRows r, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    try {
        wCalls.put(r, r);
        signal();
        r.l.await(timeout, unit);
    } finally {
        wCalls.remove(r, r);
    }
    return false;
}