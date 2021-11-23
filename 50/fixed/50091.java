public void onEventFired(java.lang.String event, java.lang.String data) {
    if ((proxySupport) != null) {
        proxySupport.onEventFired(event, data);
    }
}