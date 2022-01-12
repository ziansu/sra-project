@org.junit.Test
public void testCanNotInstantiateARemoteDriverWithBadUrl() {
    factory.setDefaultHub("some url");
    try {
        org.openqa.selenium.WebDriver driver = factory.getDriver(org.openqa.selenium.remote.DesiredCapabilities.firefox());
        fail("Exception expected");
    } catch (java.lang.Error ignored) {
    }
    assertTrue(factory.isEmpty());
}