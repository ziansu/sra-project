public void moveShooter(double value) {
    if ((encoderAt0()) && (value > 0)) {
        stopShooter();
        edu.wpi.first.wpilibj.DriverStation.reportWarning("Can't move shooter up more", true);
    }else {
        shooterAim.set(value);
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putString("DB/String 2", java.lang.Double.toString(value));
    }
    printEncoder();
}