public void csEnter() throws java.lang.Exception {
    MELogger.Info("Request %d", local.getId());
    queue.addFirst(local.getId());
    if ((status) != (MEStatus.ASKED)) {
        makeRequest();
        switchStatus(MEStatus.ASKED);
    }
    while ((status) != (MEStatus.IN_CS)) {
        assignToken();
        java.lang.Thread.sleep(10);
    } 
}