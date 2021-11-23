public void cleanup() {
    battle = null;
    if ((robotProxy) != null) {
        robotProxy.cleanup();
        robotProxy = null;
    }
    if ((statistics) != null) {
        statistics.cleanup();
        statistics = null;
    }
    status = null;
    commands = null;
    events = null;
    teamMessages = null;
    bulletUpdates = null;
    statics = null;
    battleRules = null;
    synchronized(proxyText) {
        battleText.setLength(0);
        proxyText.setLength(0);
    }
}