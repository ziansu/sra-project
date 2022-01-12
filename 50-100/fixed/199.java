@org.junit.Test
public void createWebDriverWithSelenideProxyServer() {
    com.codeborne.selenide.Configuration.fileDownload = com.codeborne.selenide.Configuration.FileDownloadMode.PROXY;
    container.createDriver();
    org.mockito.ArgumentCaptor<org.openqa.selenium.Proxy> captor = org.mockito.ArgumentCaptor.forClass(org.openqa.selenium.Proxy.class);
    verify(container.factory).createWebDriver(captor.capture());
    org.junit.Assert.assertThat(captor.getValue().getHttpProxy(), is(notNullValue()));
    org.junit.Assert.assertThat(captor.getValue().getSslProxy(), is(notNullValue()));
}