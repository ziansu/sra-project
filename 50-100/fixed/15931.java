public void teleopPeriodic() {
    double Kp = 0.03;
    double angle = gyro.getAngle();
    myRobot.mecanumDrive_Cartesian(rightStick.getY(), rightStick.getX(), rightStick.getTwist(), (angle * Kp));
    if (rightStick.getRawButton(2)) {
        climber.set(0.5);
    }else {
        climber.set(0);
    }
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
}