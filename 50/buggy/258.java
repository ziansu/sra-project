public org.openqa.selenium.WebElement getUpdateButton() {
    waitForElementToBeClickable(editButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    editButton.click();
    waitForVisibilityOfElement(updateButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    waitForElementToBeClickable(updateButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    return updateButton;
}