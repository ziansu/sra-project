@org.junit.Test
public void doesNotReopenBrowserIfItFailed() {
    com.codeborne.selenide.Configuration.reopenBrowserOnFail = false;
    org.openqa.selenium.WebDriver webdriver = mock(org.openqa.selenium.WebDriver.class);
    container.THREAD_WEB_DRIVER.put(java.lang.Thread.currentThread().getId(), webdriver);
    org.junit.Assert.assertSame(webdriver, container.getAndCheckWebDriver());
    verify(container, never()).isBrowserStillOpen(any(org.openqa.selenium.WebDriver.class));
}