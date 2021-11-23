@org.junit.Test
public void testCanInstantiateAndDismissAStandardDriver() {
    org.openqa.selenium.WebDriver driver = factory.getDriver(org.openqa.selenium.remote.DesiredCapabilities.htmlUnit());
    org.hamcrest.MatcherAssert.assertThat(driver, org.hamcrest.CoreMatchers.instanceOf(org.openqa.selenium.htmlunit.HtmlUnitDriver.class));
    org.junit.Assert.assertFalse(factory.isEmpty());
    factory.dismissDriver(driver);
    org.junit.Assert.assertTrue(factory.isEmpty());
}