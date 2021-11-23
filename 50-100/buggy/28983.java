@org.junit.Test
public void testCanNotInstantiateARemoteDriverWithBadUrl() {
    factory.setDefaultHub("some url");
    try {
        org.openqa.selenium.WebDriver driver = factory.getDriver(org.openqa.selenium.remote.DesiredCapabilities.firefox());
        org.junit.Assert.fail("Exception expected");
    } catch (java.lang.Error ignored) {
    }
    org.junit.Assert.assertTrue(factory.isEmpty());
}