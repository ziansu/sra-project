public void removeUrl(java.lang.String url) {
    mUrlList.remove(url);
    if (allDownloadsComplete())
        mLoadingProgressBar.setVisibility(View.INVISIBLE);
    
    displayUrls();
}