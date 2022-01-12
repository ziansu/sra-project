public void setUp() {
    myDriver = new org.openqa.selenium.htmlunit.HtmlUnitDriver(com.gargoylesoftware.htmlunit.BrowserVersion.FIREFOX_38);
    myDriver.manage().window().maximize();
    automationFramework.PageProvider.initialize(myDriver);
}