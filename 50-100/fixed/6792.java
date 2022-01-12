private void loadUrl(java.lang.String url) {
    if ((url != null) && (Patterns.WEB_URL.matcher(url).matches())) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new in.mobileappdev.news.ui.NewsDetailWebActivity.CustomWebViewclient(this));
        webView.loadUrl(url);
    }else {
        android.widget.Toast.makeText(this, "Url not valid, Navigating to Home screen", Toast.LENGTH_LONG).show();
        startActivity(new android.content.Intent(this, in.mobileappdev.news.ui.SplashScreenActivity.class));
        finish();
    }
}