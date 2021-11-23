public void teleopInit() {
    RobotMap.sL.SystemLoggerWriteTimeline("Teleop_Init");
    RobotMap.left1.enableBrakeMode(true);
    RobotMap.left1.enableBrakeMode(true);
    RobotMap.left2.enableBrakeMode(true);
    RobotMap.left3.enableBrakeMode(true);
    RobotMap.right1.enableBrakeMode(true);
    RobotMap.right2.enableBrakeMode(true);
    RobotMap.right3.enableBrakeMode(true);
    if ((move) != null)
        move.stop();
    
}