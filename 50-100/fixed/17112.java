@java.lang.Override
protected nodomain.freeyourgadget.gadgetbridge.service.btle.TransactionBuilder initializeDevice(nodomain.freeyourgadget.gadgetbridge.service.btle.TransactionBuilder builder) {
    builder.add(new nodomain.freeyourgadget.gadgetbridge.service.btle.actions.SetDeviceStateAction(getDevice(), nodomain.freeyourgadget.gadgetbridge.impl.GBDevice.State.INITIALIZING, getContext()));
    enableNotifications(builder, true).setLowLatency(builder).readDate(builder).testInit(builder);
    return builder;
}