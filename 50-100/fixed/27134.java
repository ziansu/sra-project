public static void getScreenShot(org.openqa.selenium.WebDriver driver, java.lang.String name) {
    java.io.File scrFile = ((org.openqa.selenium.TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);
    try {
        org.apache.commons.io.FileUtils.copyFile(scrFile, new java.io.File((("/var/www/errors/" + name) + ".jpg")));
    } catch (java.io.IOException e) {
    }
}