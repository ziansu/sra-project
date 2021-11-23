public void setSafetyEnabled(boolean enabled) {
    super.setSafetyEnabled(enabled);
    robotDrive2.setSafetyEnabled(enabled);
    robotDrive3.setSafetyEnabled(enabled);
}