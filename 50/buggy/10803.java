@org.junit.Before
public void TestSetUp() {
    driver = new org.openqa.selenium.firefox.FirefoxDriver();
    SelCommonElements = new PageObjects.CommonObj(driver);
    java.lang.System.out.print("Driver loaded before test");
}