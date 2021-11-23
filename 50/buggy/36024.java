public void runGetComments() {
    if ((proxi.tester.XPathEntryViewer.driver) == null) {
        proxi.tester.XPathEntryViewer.driver = new org.openqa.selenium.firefox.FirefoxDriver();
    }
    proxi.tester.XPathEntryViewer.driver.get(proxi.tester.XPathEntryViewer.URL);
    if (proxi.tester.XPathEntryViewer.GET_COMMENTS)
        getComments();
    
    if (proxi.tester.XPathEntryViewer.GET_NEXT_PAGE)
        getNextPage();
    
}