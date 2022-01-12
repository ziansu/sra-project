public boolean setMotors(double v) {
    updateScale();
    if (((solenoidBrake.get()) == (DoubleSolenoid.Value.kReverse)) || ((solenoidHolder.get()) == (DoubleSolenoid.Value.kForward))) {
        return false;
    }
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("Stacker setMotors value: ", v);
    this.left.set((v * (scale)));
    this.right.set((v * (-(scale))));
    return true;
}