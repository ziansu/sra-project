@java.lang.Override
public void connected() {
    if (isDeviceConnected()) {
        mwController.readDeviceInformation();
        settingsController.readDeviceName();
        switchController.enableNotification();
    }
    invalidateOptionsMenu();
    getRemoteSignals();
}