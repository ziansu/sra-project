@java.lang.Override
public void doOnResume() {
    webView.setPictureListener(new android.webkit.WebView.PictureListener() {
        @java.lang.Override
        public void onNewPicture(android.webkit.WebView view, android.graphics.Picture picture) {
            webView.scrollTo(com.rareventure.gps2.reviewer.ShowManual.lastScrollX, com.rareventure.gps2.reviewer.ShowManual.lastScrollY);
        }
    });
}