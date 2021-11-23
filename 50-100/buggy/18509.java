public void onProgressChanged(android.webkit.WebView view, int progress) {
    MyActivity.setTitle("Surfing...");
    MyActivity.setProgress((progress * 100));
    if (progress == 100) {
        MyActivity.setTitle(R.string.app_name);
        com.example.zsurfer.History h = new com.example.zsurfer.History(contentView.getUrl());
        hHandler.addHistory(h);
        android.widget.Toast.makeText(getApplicationContext(), "added ", Toast.LENGTH_LONG).show();
    }
    currentUrl = contentView.getUrl();
    url.setText(currentUrl);
}