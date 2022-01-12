public void treatRequests() throws java.lang.InterruptedException {
    setState(popjava.broker.Broker.State.Running);
    while ((getState()) == (popjava.broker.Broker.State.Running)) {
        for (popjava.combox.ComboxServer comboxServer : comboxServers) {
            popjava.broker.Request request = comboxServer.getRequestQueue().peek(popjava.broker.Broker.REQUEST_QUEUE_TIMEOUT_MS, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (request != null) {
                serveRequest(request);
            }else {
                java.lang.Thread.sleep(100);
            }
        }
    } 
    popjava.util.LogWriter.writeDebugInfo(("[Broker] Close broker " + (popInfo.getClassName())));
}