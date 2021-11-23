@java.lang.Override
public void onDeviceDisconnected(com.connectsdk.device.ConnectableDevice device) {
    org.openhab.binding.connectsdk.internal.ConnectSDKBinding.logger.info("Device disconnected: {}", device);
}