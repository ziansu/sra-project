public org.openqa.selenium.WebElement getEditButton() {
    waitForVisibilityOfElement(editButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    waitForElementToBeClickable(editButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    return editButton;
}