public void onProgressChanged(android.webkit.WebView view, int progress) {
    MyActivity.setTitle("Surfing...");
    MyActivity.setProgress((progress * 100));
    if (progress == 100) {
        MyActivity.setTitle(R.string.app_name);
    }
    currentUrl = contentView.getUrl();
    url.setText(currentUrl);
}