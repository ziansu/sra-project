@org.junit.Test
public void testCanOverrideExistingDriverProvider() {
    factory.addDriverProvider(new org.openqa.selenium.remote.server.DefaultDriverProvider(org.openqa.selenium.remote.DesiredCapabilities.firefox(), ru.stqa.selenium.factory.FakeWebDriver.class.getName()));
    org.openqa.selenium.WebDriver driver = factory.getDriver(org.openqa.selenium.remote.DesiredCapabilities.firefox());
    org.hamcrest.MatcherAssert.assertThat(driver, org.hamcrest.CoreMatchers.instanceOf(ru.stqa.selenium.factory.FakeWebDriver.class));
    assertFalse(factory.isEmpty());
    factory.dismissDriver(driver);
    assertTrue(factory.isEmpty());
}