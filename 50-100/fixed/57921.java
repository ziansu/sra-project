public boolean setMotors(double v) {
    updateScale();
    if (((solenoidBrake.get()) == (DoubleSolenoid.Value.kForward)) || ((solenoidHolder.get()) == (DoubleSolenoid.Value.kReverse))) {
        return false;
    }
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Stacker setMotors value: ", v);
    this.left.set((v * (scale)));
    this.right.set((v * (-(scale))));
    return true;
}