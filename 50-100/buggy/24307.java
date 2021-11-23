public void onPageFinished(android.webkit.WebView view, java.lang.String URL) {
    java.lang.String javascript = null;
    try {
        webView.loadUrl((("javascript:init('" + (jsonObject.getString("pageContent"))) + "')"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}