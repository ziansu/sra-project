public void teleopPeriodic() {
    myRobot.tankDrive(stick.getRawAxis(1), stick.getRawAxis(5));
    if (LB.get()) {
        java.lang.System.out.println("a button true");
        DoubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    }else
        if (RB.get()) {
            DoubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
            java.lang.System.out.println("x button true");
        }else {
            DoubleSolenoid1.set(DoubleSolenoid.Value.kOff);
        }
    
}