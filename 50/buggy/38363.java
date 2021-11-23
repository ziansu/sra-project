private void onApnChanged() {
    DBG = $missing$;
    log("onApnChanged: tryRestartDataConnections");
    tryRestartDataConnections(Phone.REASON_APN_CHANGED);
}