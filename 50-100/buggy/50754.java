@org.junit.Test
public void checksIfBrowserIsStillAlive() {
    com.codeborne.selenide.Configuration.reopenBrowserOnFail = true;
    org.openqa.selenium.WebDriver webdriver = org.mockito.Mockito.mock(org.openqa.selenium.WebDriver.class);
    container.THREAD_WEB_DRIVER.put(java.lang.Thread.currentThread().getId(), webdriver);
    org.junit.Assert.assertSame(webdriver, container.getAndCheckWebDriver());
    org.mockito.Mockito.verify(container).isBrowserStillOpen(org.mockito.ArgumentMatchers.any(org.openqa.selenium.WebDriver.class));
}