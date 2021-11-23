public synchronized void addUrlToCheck(java.util.ArrayList<java.lang.String> urls) {
    if ((urls != null) && ((urls.size()) > 0)) {
        urlsToCheck.addAll(urls);
        isChecking = true;
    }
}