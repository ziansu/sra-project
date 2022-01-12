public void clickOnJobOffersByLink() {
    boolean isElementPresent = checkElementDisplayedByXpath("html/body/div[6]/div/div/div/div[3]/form/div[1]/button");
    if (isElementPresent) {
        getDriver().findElement(org.openqa.selenium.By.xpath("html/body/div[6]/div/div/div/div[3]/form/div[1]/button")).click();
    }
    getDriver().findElement(org.openqa.selenium.By.partialLinkText("Job Offers")).click();
    if (checkElementPresentByXpath("html/body/header/nav/div/ul[1]/li[1]/a")) {
    }else {
        getDriver().findElement(org.openqa.selenium.By.xpath("html/body/header/nav/div/ul[1]/li[1]/a")).click();
    }
}