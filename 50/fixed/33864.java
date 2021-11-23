@org.testng.annotations.BeforeSuite
public void startup() {
    org.openqa.selenium.WebDriver driver = Utility.Browser.getDriver("chrome");
    new pageObjects.BaseClass(driver);
    reports = Utility.ExtentManager.GetExtent();
}