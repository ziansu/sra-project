public void teleopPeriodic() {
    edu.wpi.first.wpilibj.command.Scheduler.getInstance().run();
    dTrain.tank(org.usfirst.frc.team5979.robot.Robot.oi.getlYAxis(), org.usfirst.frc.team5979.robot.Robot.oi.getrYAxis());
    climber.tank(agg.combineSpeed(org.usfirst.frc.team5979.robot.Robot.oi.getlTAxis(), org.usfirst.frc.team5979.robot.Robot.oi.getrTAxis()), 0);
}