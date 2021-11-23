private boolean openSolenoidUpper() {
    if ((solenoidUpper.get()) == (DoubleSolenoid.Value.kForward)) {
        return false;
    }
    if ((solenoidContainer.get()) == (DoubleSolenoid.Value.kReverse)) {
        return false;
    }
    solenoidUpper.set(DoubleSolenoid.Value.kForward);
    return true;
}