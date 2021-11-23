public void displayWebsite(java.lang.String content) {
    markdownView = new us.feras.mdv.MarkdownView(this);
    markdownView.setWebViewClient(new android.webkit.WebViewClient() {
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
            openNewPage(url);
            return true;
        }
    });
    setContentView(markdownView);
    markdownView.loadMarkdown(content);
}