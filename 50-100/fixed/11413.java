public boolean clickOnMoreOptions(main.Task1Project.Item item) {
    org.openqa.selenium.WebElement button = extractText(item);
    if (button != null) {
        java.lang.String buttonText = button.getText().trim();
        if (buttonText.equals(optionsButtonName)) {
            LoggerWrapper.myLogger.log(java.util.logging.Level.INFO, "clicking on Options button");
            button.click();
            return true;
        }
    }
    return false;
}