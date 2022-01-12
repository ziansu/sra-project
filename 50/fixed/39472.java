public void onMapEvent(final java.lang.String eventName) {
    webView.loadUrl((("javascript:plugin.google.maps.Map._onMapEvent('" + eventName) + "')"));
}