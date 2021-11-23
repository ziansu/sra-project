public boolean isOnThePage(java.lang.String issueId) {
    java.lang.String url = java.lang.String.format(pageURL, issueId);
    return isOnThePage(url);
}