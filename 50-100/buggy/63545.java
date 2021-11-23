@org.testng.annotations.Test(priority = 16)
public void viewAll() {
    Hp.clickViewAll();
    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
    org.testng.Assert.assertEquals(driver.getTitle(), "Check Out Goodman Manufacturing's Product Range");
    driver.navigate().back();
    driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
}