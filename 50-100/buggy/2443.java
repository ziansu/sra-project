private void connect() {
    java.util.Map<java.lang.String, java.lang.String> headers = new java.util.HashMap<java.lang.String, java.lang.String>();
    headers.put("X-Sd-Token", streamdataioAppToken);
    try {
        java.lang.String targetUrl = (streamdataioProxyPrefix) + (myApi);
        eventSource = new tylerjroach.com.eventsource_android.EventSource(new java.net.URI(targetUrl), new com.streamdataio.android.stockmarket.StockMarketList.SSEHandler(), headers);
    } catch (java.net.URISyntaxException e) {
        e.printStackTrace();
    }
    eventSource.connect();
}