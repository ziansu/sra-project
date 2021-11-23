public void setSetpoint(org.usfirst.frc.team246.robot.OverclockedLibraries.Vector2D setpoint) {
    this.setpoint = setpoint;
    org.usfirst.frc.team246.robot.OverclockedLibraries.Vector2D d = org.usfirst.frc.team246.robot.OverclockedLibraries.Vector2D.subtractVectors(vectorSource.pidGet(), setpoint);
    PID.setSetpoint(d.getMagnitude());
}