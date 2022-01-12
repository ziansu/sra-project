public void await(org.araqne.logdb.client.LogDbClient.QueuedRows r) throws java.lang.InterruptedException {
    try {
        wCalls.put(r, r);
        signal();
        while (true) {
            if (!(running)) {
                r.setDone(new java.net.SocketException("closed"));
                break;
            }
            if (r.l.await(50, java.util.concurrent.TimeUnit.MILLISECONDS))
                break;
            
        } 
    } finally {
        wCalls.remove(r, r);
    }
}