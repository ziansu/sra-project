protected boolean addUrlToDownload(java.lang.String url) throws java.lang.InterruptedException {
    if (!(pagesVisited.contains(url))) {
        urlsToDownload.put(url);
        return true;
    }
    return false;
}