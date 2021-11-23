protected void setSolenoids() {
    Robot.stacker.openSolenoidUpper();
    Robot.stacker.openSolenoidBottom();
    Robot.stacker.closeSolenoidContainer();
}