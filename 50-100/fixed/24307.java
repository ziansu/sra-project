public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    try {
        webView.loadUrl((("javascript:init('" + (jsonObject.getString("pageContent"))) + "')"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}