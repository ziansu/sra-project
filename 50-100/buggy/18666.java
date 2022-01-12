public boolean commitTransaction() {
    boolean decision = false;
    if ((siteManagerIds.size()) == 1) {
        decision = commitClientTransaction(siteManagerClient);
    }else {
        decision = twoPC();
    }
    if (decision) {
        long GLOBAL_END_TIME = java.lang.System.nanoTime();
        log.info("{} client {} EndCommit: took: {} ns", new java.util.Date(), clientId, (GLOBAL_END_TIME - (GLOBAL_START_TIME)));
        siteManagerClient = null;
    }
    return decision;
}