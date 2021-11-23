@java.lang.Override
protected void execute() {
    if (((this.timer.getFPGATimestamp()) - (this.initialTime)) < (org.usfirst.frc.team4611.robot.RobotMap.soleTime)) {
        Robot.feedSolenoid.feed(Value.kReverse);
    }else {
        Robot.feedSolenoid.feed(Value.kOff);
    }
}