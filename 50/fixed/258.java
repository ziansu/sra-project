public org.openqa.selenium.WebElement getUpdateButton() {
    waitForVisibilityOfElement(updateButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    waitForElementToBeClickable(updateButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    return updateButton;
}