@java.lang.Override
public void channelUnlinked(org.eclipse.smarthome.core.thing.ChannelUID channelUID) {
    super.channelUnlinked(channelUID);
    bluetoothSmartService.removeCharacteristicListener(getDeviceAddress(), getServiceUUID(channelUID.getIdWithoutGroup()), getCharacteristicUUID(channelUID.getIdWithoutGroup()));
}