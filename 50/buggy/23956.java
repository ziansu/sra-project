private void Open() {
    org.usfirst.frc.team166.robot.subsystems.Claw.solenoid.set(true);
    this.clawState = org.usfirst.frc.team166.robot.subsystems.Claw.ClawStates.open;
}