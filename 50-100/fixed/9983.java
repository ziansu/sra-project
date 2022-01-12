public void manualCtl() {
    double y = m_liftStick.getY(GenericHID.Hand.kLeft);
    m_robot.logger.debug(("manualCtl:" + y));
    if ((isAnyLimitSwitchClosed()) || ((java.lang.Math.abs(y)) < (k_minJoystickValue))) {
        stopMotor();
    }else {
        startMotor();
        m_mainMotor.set(y);
    }
}