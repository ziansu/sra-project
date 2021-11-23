public void teleopPeriodic() {
    boxAlign.startDash();
    jagSlave.startTeleop();
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("Right trigger", jagSlave.joyButton7());
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putBoolean("Left trigger", jagSlave.joyButton8());
    if ((jagSlave.joyButton7()) == true) {
        lifter.telopMoveUp();
    }
}