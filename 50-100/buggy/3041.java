public boolean dismissRateDialogIfNecessary() throws java.lang.Exception {
    com.android.uiautomator.core.UiSelector selector = new com.android.uiautomator.core.UiSelector();
    com.android.uiautomator.core.UiObject closeButton = new com.android.uiautomator.core.UiObject(selector.text("NOT NOW"));
    if (closeButton.waitForExists(java.util.concurrent.TimeUnit.SECONDS.toMillis(com.arm.wlauto.uiauto.antutu.UiAutomation.initialTimeoutSeconds))) {
        closeButton.click();
        sleep(1);
        return true;
    }else {
        return false;
    }
}