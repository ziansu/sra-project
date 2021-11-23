public com.denimgroup.threadfix.selenium.pages.ScannerVulnerabilityTypesPage clickCreateNewMappingButton() {
    waitForElement(org.openqa.selenium.By.id("createNewChannelVulnModalButton"));
    driver.findElementById("createNewChannelVulnModalButton").click();
    waitForElement(org.openqa.selenium.By.id("myModalLabel"));
    return new com.denimgroup.threadfix.selenium.pages.ScannerVulnerabilityTypesPage(driver);
}