public void clickOnJobOffersByLink() {
    boolean isElementPresent = checkElementDisplayedByXpath("html/body/div[6]/div/div/div/div[3]/form/div[1]/button");
    if (isElementPresent) {
        getDriver().findElement(org.openqa.selenium.By.xpath("html/body/div[6]/div/div/div/div[3]/form/div[1]/button")).click();
    }
    getDriver().findElement(org.openqa.selenium.By.partialLinkText("Job Offers")).click();
}