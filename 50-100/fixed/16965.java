public void initializeUI() {
    wikiViewer = ((com.jtmcn.archwiki.viewer.WikiView) (findViewById(R.id.wvMain)));
    android.widget.ProgressBar progressBar = ((android.widget.ProgressBar) (findViewById(R.id.ProgressBar)));
    com.jtmcn.archwiki.viewer.WikiChromeClient wikiChrome;
    wikiChrome = new com.jtmcn.archwiki.viewer.WikiChromeClient(progressBar, getActionBar());
    wikiViewer.setWebChromeClient(wikiChrome);
}