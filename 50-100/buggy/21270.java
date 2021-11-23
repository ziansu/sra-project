public java.lang.String getIOSDeviceProductVersion() throws java.io.IOException, java.lang.InterruptedException {
    if ((com.appium.manager.DeviceManager.getDeviceUDID().length()) == (com.appium.ios.IOSDeviceConfiguration.IOS_UDID_LENGTH)) {
        return commandPrompt.runCommandThruProcessBuilder((("ideviceinfo --udid " + (com.appium.manager.DeviceManager.getDeviceUDID())) + " | grep ProductVersion")).split(":")[1].replace("\n", "");
    }else {
        return simulatorManager.getSimulatorDetails(com.appium.manager.DeviceManager.getDeviceUDID()).getOsVersion();
    }
}