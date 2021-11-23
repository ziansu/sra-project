@java.lang.Override
public void teleopPeriodic() {
    rd.arcadeDrive(driveStick.sgetY(), driveStick.sgetTwist());
}