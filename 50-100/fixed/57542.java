@org.junit.Test
public void testCanInstantiateAndDismissADriverWithACustomDriverProvider() {
    org.openqa.selenium.WebDriver driver = factory.getDriver(fakeCapabilities);
    org.hamcrest.MatcherAssert.assertThat(driver, org.hamcrest.CoreMatchers.instanceOf(ru.stqa.selenium.factory.FakeWebDriver.class));
    assertFalse(factory.isEmpty());
    factory.dismissDriver(driver);
    assertTrue(factory.isEmpty());
}