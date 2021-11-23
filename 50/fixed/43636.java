private android.graphics.Bitmap loadFavicon(com.example.jose.updated.model.Page page) {
    webView.loadData(page.getContents(), "text/html", null);
    webView.setActivated(false);
    return webView.getFavicon();
}