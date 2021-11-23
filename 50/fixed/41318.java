public void autonomousPeriodic() {
    RobotMap.sL.SystemLoggerWriteTimeline("Autonomous+Periodic");
    commonPeriodic();
    move.update();
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
}