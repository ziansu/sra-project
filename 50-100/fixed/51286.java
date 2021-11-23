public void displayContent(java.lang.String content) {
    markdownView = new us.feras.mdv.MarkdownView(this);
    markdownView.setWebViewClient(new android.webkit.WebViewClient() {
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
            android.widget.Toast.makeText(internetofeveryone.ioe.Downloads.DownloadsActivity.this, "Links are not supported in offline version", Toast.LENGTH_SHORT).show();
            return true;
        }
    });
    setContentView(markdownView);
    markdownView.loadMarkdown(content);
}