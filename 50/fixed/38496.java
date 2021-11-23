public org.openqa.selenium.WebElement getTextarea() {
    waitForVisibilityOfElement(editTextarea, rv.atqc.gttesting.archex.MAX_TIME_WAIT);
    return editTextarea;
}