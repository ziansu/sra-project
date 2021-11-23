@java.lang.Override
public synchronized void shutdown() {
    for (final org.openqa.selenium.WebDriver webdriver : threadIdToDriverMap.values()) {
        try {
            if (!(au.com.agic.apptesting.utils.impl.LocalThreadWebDriverMapImpl.WEB_DRIVER_FACTORY.leaveWindowsOpen())) {
                webdriver.quit();
            }
        } catch (final java.lang.Exception ignored) {
        }
    }
    threadIdToDriverMap.clear();
    threadIdToCapMap.clear();
    getTempFolders().forEach(( e) -> javaslang.control.Try.run(() -> org.apache.commons.io.FileUtils.deleteDirectory(e)));
    currentUrl = 0;
}