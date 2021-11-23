public void setMaxRequestCount(int maxRequestCount) {
    this.maxRequestCount = maxRequestCount;
    while ((!(taskQueue.isEmpty())) && (((activeRequestCount) < maxRequestCount) || (maxRequestCount < 0))) {
        runQueuedTask(false);
    } 
}