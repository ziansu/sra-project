public void setMaxSpeedState(final com.cooper.wheellog.BluetoothLeService mBluetoothLeService, final int maxSpeed) {
    settingCommandReady = true;
    settingCommand = com.cooper.wheellog.utils.InMotionAdapter.CANMessage.setMaxSpeed(maxSpeed).writeBuffer();
}