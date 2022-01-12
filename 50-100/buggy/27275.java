private void closeChannel(org.md2k.autosense.devices.AutoSensePlatform autoSensePlatform) {
    synchronized(mChannelControllerList) {
        org.md2k.autosense.antradio.connection.ChannelController channelController = mChannelControllerList.get((((autoSensePlatform.getPlatformType()) + ":") + (autoSensePlatform.getDeviceId())));
        channelController.close();
        mChannelControllerList.remove((((autoSensePlatform.getPlatformType()) + ":") + (autoSensePlatform.getDeviceId())));
    }
}