@org.junit.Test
public void createWebDriverWithoutProxy() {
    com.codeborne.selenide.Configuration.fileDownload = com.codeborne.selenide.Configuration.FileDownloadMode.HTTPGET;
    container.createDriver();
    org.mockito.Mockito.verify(container.factory).createWebDriver(null);
}