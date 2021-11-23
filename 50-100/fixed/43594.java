public org.nuxeo.functionaltests.contentView.ContentViewElement checkByIndex(int... indexes) {
    java.lang.String id = getId();
    org.nuxeo.functionaltests.AjaxRequestManager a = new org.nuxeo.functionaltests.AjaxRequestManager(driver);
    for (int i : indexes) {
        a.watchAjaxRequests();
        getItems().get(i).findElement(org.openqa.selenium.By.xpath(org.nuxeo.functionaltests.contentView.ContentViewElement.CHECK_BOX_XPATH)).click();
        a.waitForAjaxRequests();
    }
    return reload(id);
}