public void setMaxSpeedState(final int maxSpeed) {
    settingCommandReady = true;
    settingCommand = com.cooper.wheellog.utils.InMotionAdapter.CANMessage.setMaxSpeed(maxSpeed).writeBuffer();
}