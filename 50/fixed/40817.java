@org.junit.After
public void tearDown() {
    if (!((driver) == null)) {
        if (!(isTestPass)) {
            utils.screenShot(pathToScreenShot, driver);
        }
        driver.quit();
    }
}