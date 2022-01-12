@org.junit.Test
public void throwsOnAttemptToInstantiateADriverByBadClassName() {
    org.openqa.selenium.remote.DesiredCapabilities capabilities = new org.openqa.selenium.remote.DesiredCapabilities();
    capabilities.setBrowserName("FAKE-2");
    try {
        org.openqa.selenium.WebDriver driver = factory.getDriver(capabilities);
        fail("Exception expected");
    } catch (java.lang.Exception expected) {
    }
    assertTrue(factory.isEmpty());
}