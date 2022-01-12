public void expandAllConnectionTreeNodes() {
    webDriver.manage().timeouts().implicitlyWait(0, java.util.concurrent.TimeUnit.SECONDS);
    genericWebElementList = webDriver.findElements(connectionTreeAllBranchesCSS);
    for (org.openqa.selenium.WebElement ulElement : genericWebElementList) {
        for (org.openqa.selenium.WebElement liElement : ulElement.findElements(">li")) {
            liElement.findElement();
        }
    }
    webDriver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
}