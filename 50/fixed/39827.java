public void SelectCreatedTO(java.lang.String tOname) throws java.lang.InterruptedException {
    utils.OpenPlus.expandAll();
    java.lang.Thread.sleep(500);
    driver.findElement(org.openqa.selenium.By.partialLinkText(tOname)).click();
    java.lang.Thread.sleep(500);
}