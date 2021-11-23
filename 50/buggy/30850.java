public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    java.lang.System.out.println(gyro.getAngle());
}