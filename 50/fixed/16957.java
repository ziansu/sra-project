public void setHandleButtonState(final boolean handleButtonEnable) {
    settingCommandReady = true;
    settingCommand = com.cooper.wheellog.utils.InMotionAdapter.CANMessage.setHandleButton(handleButtonEnable).writeBuffer();
}