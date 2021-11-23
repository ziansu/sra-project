public void cancelAll() {
    cancelled = true;
    requests.clear();
    java.lang.Object[] arrObj_request = nowServingRequests.toArray();
    for (java.lang.Object request : arrObj_request) {
        if (request != null)
            ((ir.afshin.netup.Requests.Request) (request)).cancel();
        
    }
    if ((onQueueStatusChangedListener) != null)
        onQueueStatusChangedListener.onStatusChanged(this, ir.afshin.netup.Requests.RequestQueue.QueueStatus.Cancelled, requests.size(), nowServingRequests.size());
    
}