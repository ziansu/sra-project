public org.openqa.selenium.WebElement getTextarea() {
    waitForElementToBeClickable(editButton, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    editButton.click();
    waitForVisibilityOfElement(editTextarea, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    return editTextarea;
}