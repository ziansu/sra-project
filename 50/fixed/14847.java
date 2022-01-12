public void facebookLogin() throws java.lang.InterruptedException {
    io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(driver);
    action.longPress(mobileButton).release().perform();
    java.lang.Thread.sleep(4000);
    localMachineSetup();
}