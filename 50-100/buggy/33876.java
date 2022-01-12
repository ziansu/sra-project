private void resizeImages() {
    org.wordpress.android.ui.reader.utils.ReaderHtmlUtils.HtmlScannerListener imageListener = new org.wordpress.android.ui.reader.utils.ReaderHtmlUtils.HtmlScannerListener() {
        @java.lang.Override
        public void onTagFound(java.lang.String imageTag, java.lang.String imageUrl) {
            if (!(imageUrl.contains("wpcom-smileys"))) {
                replaceImageTag(imageTag, imageUrl);
            }
        }
    };
    org.wordpress.android.ui.reader.utils.ReaderImageScanner scanner = new org.wordpress.android.ui.reader.utils.ReaderImageScanner(mRenderBuilder.toString(), mPost.isPrivate);
    scanner.beginScan(imageListener);
}