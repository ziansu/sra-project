public org.openqa.selenium.WebElement getEditButton() {
    waitForElementToBeClickable(editButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    return editButton;
}