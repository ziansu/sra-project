@java.lang.Override
public void teleopPeriodic() {
    rd.arcadeDrive((0 - (driveStick.sgetY())), (0 - (driveStick.sgetTwist())));
}