public void expandAllConnectionTreeNodes() {
    webDriver.manage().timeouts().implicitlyWait(0, java.util.concurrent.TimeUnit.SECONDS);
    genericWebElementList = webDriver.findElements(connectionTreeAllBranchesCSS);
    for (org.openqa.selenium.WebElement ulElement : genericWebElementList) {
    }
    webDriver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
}