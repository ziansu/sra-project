public static void quitDriver() {
    if ((com.alllxt.selenium.framework.webdriver.manager.LocalDriverManager.getDriver()) != null) {
        try {
            com.alllxt.selenium.framework.webdriver.manager.LocalDriverManager.getDriver().quit();
            com.alllxt.selenium.framework.webdriver.manager.LocalDriverManager.setWebDriver(null);
        } catch (java.lang.Exception exception) {
            java.lang.String errorMSG = exception.getMessage();
            if (errorMSG == null) {
                errorMSG = "The error message is empty.";
            }
        } finally {
            com.alllxt.selenium.framework.webdriver.manager.LocalDriverManager.setWebDriver(null);
        }
    }
}