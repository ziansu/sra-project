private void logContainerInfo(e18.Container c) {
    e18.HistoryNode n = new e18.HistoryNode();
    n.numops = c.numops();
    n.next = log;
    log = n;
}