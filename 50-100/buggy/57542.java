@org.junit.Test
public void testCanInstantiateAndDismissADriverWithACustomDriverProvider() {
    org.openqa.selenium.WebDriver driver = factory.getDriver(fakeCapabilities);
    org.hamcrest.MatcherAssert.assertThat(driver, org.hamcrest.CoreMatchers.instanceOf(ru.stqa.selenium.factory.FakeWebDriver.class));
    org.junit.Assert.assertFalse(factory.isEmpty());
    factory.dismissDriver(driver);
    org.junit.Assert.assertTrue(factory.isEmpty());
}