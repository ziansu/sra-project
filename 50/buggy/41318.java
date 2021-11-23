public void autonomousPeriodic() {
    RobotMap.sL.SystemLoggerWriteTimeline("Autonomous+Periodic");
    commonPeriodic();
    move.update();
    RobotMap.sL.SystemLoggerWriteTimeline("Move_Update");
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
}