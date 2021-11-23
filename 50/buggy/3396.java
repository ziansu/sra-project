public static void init() {
    org.usfirst.frc.team5968.robot.RopeClimber.leftMotor.changeControlMode(CANTalon.TalonControlMode.Follower);
    org.usfirst.frc.team5968.robot.RopeClimber.leftMotor.set((-1));
    org.usfirst.frc.team5968.robot.RopeClimber.climberEncoder.setDistancePerPulse((8 / 2048));
}