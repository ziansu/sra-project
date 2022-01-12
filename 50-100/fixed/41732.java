private void setPrefs() {
    android.webkit.WebSettings webSettings = webView.getSettings();
    webSettings.setJavaScriptEnabled(prefs.getBoolean("javascript", true));
    webSettings.setGeolocationEnabled(prefs.getBoolean("location_services", true));
    webSettings.setSupportZoom(prefs.getBoolean("zooming", false));
}