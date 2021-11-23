@java.lang.Override
public void teleopPeriodic() {
    double[] inputs = this.driveStation.getInputs();
    this.chassis.drive(inputs[0], inputs[1]);
    frc.team4215.stronghold.RobotModule.logger.info("Hello");
}