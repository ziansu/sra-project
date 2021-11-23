protected void takeScreenshot(java.io.File file) throws java.io.IOException, org.openqa.selenium.WebDriverException {
    java.io.FileOutputStream fileOuputStream = new java.io.FileOutputStream(file);
    try {
        fileOuputStream.write(((org.openqa.selenium.TakesScreenshot) (webDriver)).getScreenshotAs(OutputType.BYTES));
    } finally {
        fileOuputStream.flush();
        fileOuputStream.close();
    }
}