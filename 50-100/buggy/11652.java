public void ExtractOnlineDocuments() {
    if ((profile.getUrls().size()) > 0) {
        for (java.lang.String url : profile.getUrls()) {
            ExtractWebArticles(url);
        }
        driver.quit();
        ExtractKeyterms();
    }else {
        driver.quit();
    }
}