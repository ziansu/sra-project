public void setLeftSpeed(double speed) {
    leftMotor1.set(((-speed) * (org.usfirst.frc.team5677.robot.subsystems.DriveTrain.LEFT_SCALE)));
    leftMotor2.set(((-speed) * (org.usfirst.frc.team5677.robot.subsystems.DriveTrain.LEFT_SCALE)));
}