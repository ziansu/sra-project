@io.appium.java_client.ios.AfterClass
public static void afterClass() {
    if ((io.appium.java_client.ios.XCUIDriverTest.driver) != null) {
        io.appium.java_client.ios.XCUIDriverTest.driver.quit();
    }
    if ((io.appium.java_client.ios.XCUIDriverTest.service) != null) {
        io.appium.java_client.ios.XCUIDriverTest.service.stop();
    }
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File(((io.appium.java_client.ios.XCUIDriverTest.SOURCE) + "/UICatalog.app")));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}