@org.testng.annotations.AfterClass(alwaysRun = true)
public synchronized void killAppiumServer() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println(("**************ClosingAppiumSession****************" + (java.lang.Thread.currentThread().getId())));
    appiumMan.destroyAppiumNode();
    if (driver.toString().split(":")[0].trim().equals("IOSDriver")) {
        iosDevice.destroyIOSWebKitProxy();
    }
    com.appium.manager.AppiumParallelTest.freeDevice(device_udid);
}