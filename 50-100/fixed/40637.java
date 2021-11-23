public void execute() {
    double i = (getInput()) * ((direction) == (org.stlpriory.robotics.commands.drivetrain.DriveStraight.Direction.REVERSE) ? 1 : -1);
    Robot.drivetrain.tankDrive((i * (org.stlpriory.robotics.commands.drivetrain.DriveStraight.COEFFICIENT)), (i * (org.stlpriory.robotics.commands.drivetrain.DriveStraight.COEFFICIENT)));
}