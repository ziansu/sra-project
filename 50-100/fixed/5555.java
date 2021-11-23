public void csEnter() throws java.lang.Exception {
    MELogger.Info("Request %d", local.getId());
    queue.addFirst(local.getId());
    assignToken();
    makeRequest();
    while ((status) != (MEStatus.IN_CS)) {
        java.lang.Thread.sleep(10);
    } 
}