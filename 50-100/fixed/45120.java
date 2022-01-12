private synchronized boolean enqueue(edu.umass.cs.reconfiguration.ReconfigurableAppClientAsync.RequestAndCallback rc) {
    this.requestsPendingActives.putIfAbsent(rc.request.getServiceName(), new java.util.concurrent.LinkedBlockingQueue<edu.umass.cs.reconfiguration.ReconfigurableAppClientAsync.RequestAndCallback>());
    java.util.concurrent.LinkedBlockingQueue<edu.umass.cs.reconfiguration.ReconfigurableAppClientAsync.RequestAndCallback> pending = this.requestsPendingActives.get(rc.request.getServiceName());
    assert pending != null;
    return pending.add(rc);
}