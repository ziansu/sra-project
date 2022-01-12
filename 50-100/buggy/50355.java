public static java.io.File getChromeDriver() {
    org.openqa.selenium.Platform current = org.openqa.selenium.Platform.getCurrent();
    if (current.is(org.openqa.selenium.Platform.WINDOWS)) {
        return io.appium.java_client.ChromeDriverPathUtil.ROOT_TEST_PATH.resolve("chromedriver.exe").toFile();
    }else
        if (current.is(org.openqa.selenium.Platform.MAC)) {
            return io.appium.java_client.ChromeDriverPathUtil.ROOT_TEST_PATH.resolve("chromedriver_mac").toFile();
        }else {
            return io.appium.java_client.ChromeDriverPathUtil.ROOT_TEST_PATH.resolve("chromedriver_linux").toFile();
        }
    
}