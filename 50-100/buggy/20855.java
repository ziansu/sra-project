public void start() {
    started = java.lang.System.currentTimeMillis();
    initVariables(true);
    try {
        setSendInterval(java.lang.Long.parseLong(com.mobilesorcery.sdk.core.MoSyncTool.getDefault().getProperty(com.mobilesorcery.sdk.core.stats.Stats.SEND_INTERVAL_PROP)));
    } catch (java.lang.Exception e) {
        setSendInterval(com.mobilesorcery.sdk.core.stats.Stats.UNASSIGNED_SEND_INTERVAL);
    }
}