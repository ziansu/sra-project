void enterInputValue(final org.openqa.selenium.WebElement inputElement, final java.lang.String value) throws java.lang.Exception {
    waitForElementVisible(inputElement);
    final java.lang.String inputID = inputElement.getAttribute("id");
    summonTooltip(inputID);
    showInputField(inputID);
    for (int i = 0; i < (value.length()); i++) {
        inputElement.sendKeys(java.lang.Character.toString(value.charAt(i)));
        waitFor(150L);
    }
    closeTooltip();
}