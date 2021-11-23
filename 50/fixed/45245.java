protected void setSolenoids() {
    Robot.stacker.closeSolenoidContainer();
    Robot.stacker.openSolenoidUpper();
    Robot.stacker.openSolenoidBottom();
}