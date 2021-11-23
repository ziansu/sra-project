public void clickAddMoreConstSumOptionLink(int qnIndex) {
    org.openqa.selenium.WebElement addMoreOptionLink = browser.driver.findElement(org.openqa.selenium.By.id(("constSumAddOptionLink-" + qnIndex)));
    click(addMoreOptionLink);
}