public org.nuxeo.functionaltests.contentView.ContentViewElement checkAllItems() {
    org.openqa.selenium.WebElement selectAll = null;
    try {
        selectAll = getResultsPanel().findElement(org.openqa.selenium.By.xpath(org.nuxeo.functionaltests.contentView.ContentViewElement.SELECT_ALL_BUTTON_XPATH));
    } catch (org.openqa.selenium.NoSuchElementException e) {
    }
    if (selectAll != null) {
        org.nuxeo.functionaltests.AjaxRequestManager arm = new org.nuxeo.functionaltests.AjaxRequestManager(driver);
        arm.begin();
        selectAll.click();
        arm.end();
        return reload();
    }
    return this;
}