private void handleScreenOn() {
    org.davis.inputdisabler.utils.Device.enableKeys(true);
    org.davis.inputdisabler.utils.Device.enableTouch(true);
    org.davis.inputdisabler.utils.Device.enableTouch(false);
    org.davis.inputdisabler.utils.Device.enableTouch(true);
    org.davis.inputdisabler.ScreenStateReceiver.mScreenOn = true;
}