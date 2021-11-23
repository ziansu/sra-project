protected void execute() {
    Robot.driveTrainSub.tankDrive((-(Robot.oi.getRawAnalogStickALY())), Robot.oi.getRawAnalogStickARY());
}