public void createPage(java.lang.String titleText, java.lang.String urlText, long time) {
    com.example.jose.updated.model.Page newPage = new com.example.jose.updated.model.Page(titleText, urlText, time);
    try {
        newPage.setContents(refresher.downloadHtml(newPage));
        newPage.setTimeOfLastUpdateInMilliSec(new java.util.Date().getTime());
        newPage.setIsActive(true);
        addToAllPages(newPage);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}