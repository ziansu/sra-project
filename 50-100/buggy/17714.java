private void resizeIframes() {
    org.wordpress.android.ui.reader.utils.ReaderHtmlUtils.HtmlScannerListener iframeListener = new org.wordpress.android.ui.reader.utils.ReaderHtmlUtils.HtmlScannerListener() {
        @java.lang.Override
        public void onTagFound(java.lang.String tag, java.lang.String src) {
            replaceIframeTag(tag, src);
        }
    };
    org.wordpress.android.ui.reader.utils.ReaderIframeScanner scanner = new org.wordpress.android.ui.reader.utils.ReaderIframeScanner(mRenderBuilder.toString());
    scanner.beginScan(iframeListener);
}