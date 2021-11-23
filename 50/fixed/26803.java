@org.testng.annotations.BeforeTest
public void setUp() throws java.lang.Exception {
    this.driver = com.mishi.appium.base.BaseDriverConfig.getInstance().getDriver();
}