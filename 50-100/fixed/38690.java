public void takeScreenShot(org.openqa.selenium.WebDriver driver, java.lang.String snapshotName) {
    java.io.File objScreenCaptureFile = ((org.openqa.selenium.TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);
    try {
        org.apache.commons.io.FileUtils.copyFile(objScreenCaptureFile, new java.io.File((("./images/" + snapshotName) + ".png")));
        org.testng.Reporter.log((((("<td><a href='../../images/" + snapshotName) + ".png'><img src='../../images/") + snapshotName) + ".png' height='100' width='100' /></a></td>"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}