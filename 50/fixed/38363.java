private void onApnChanged() {
    if (DBG)
        log("onApnChanged: tryRestartDataConnections");
    
    tryRestartDataConnections(Phone.REASON_APN_CHANGED);
}