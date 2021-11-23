private void setSpeed(int speed) {
    curSpeed = speed;
    if ((curCmd) != (com.protoplant.xtruder2.usb.StepperModule.CommandType.SET_CONFIG))
        curCmd = com.protoplant.xtruder2.usb.StepperModule.CommandType.SET_SPEED;
    
}