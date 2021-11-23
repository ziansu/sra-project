public void teleopPeriodic() {
    myRobot.tankDrive(stick.getRawAxis(1), stick.getRawAxis(5));
    if (LB.get()) {
        DoubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }else
        if (RB.get()) {
            DoubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
        }else {
            DoubleSolenoid1.set(DoubleSolenoid.Value.kOff);
        }
    
}