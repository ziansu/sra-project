private void switchModulsEnd(frame.keyword.action.driver.Driver driver) {
    if (Driver.isWeb) {
        frame.keyword.action.browser.BrowserDriver browser = ((frame.keyword.action.browser.BrowserDriver) (driver));
        if ((browser.device) != null) {
            driver.log("switch：退出device模式");
            this.switchDeviceEnd(driver);
        }
    }else {
        frame.keyword.action.device.DeviceDriver device = ((frame.keyword.action.device.DeviceDriver) (driver));
        if ((device.browser) != null) {
            driver.log("switch：退出web模式");
            this.switchWebEnd(driver);
        }
    }
}