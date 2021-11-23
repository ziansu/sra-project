public void receiveServerMessage(java.lang.String message) {
    org.openhab.binding.gpioremotecontrol.internal.GpioRemoteControlBinding.logger.debug(">>>>> GpioRemoteControl: receiveServerMessage!");
    try {
        parseAndUpdatePinInput(message);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    try {
        parseAndUpdateTemperature(message);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}