protected void addBleRequest(com.hypercryptic.bleware.BLERequest request) {
    synchronized(mRequestQueue) {
        mRequestQueue.add(request);
        processNextRequest();
    }
}