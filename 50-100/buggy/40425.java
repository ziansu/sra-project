public void teleopInit() {
    RobotMap.sL.SystemLoggerWriteTimeline("Teleop_Init");
    RobotMap.left1.enableBrakeMode(true);
    RobotMap.left1.enableBrakeMode(true);
    RobotMap.left2.enableBrakeMode(true);
    RobotMap.left3.enableBrakeMode(true);
    RobotMap.right1.enableBrakeMode(true);
    RobotMap.right2.enableBrakeMode(true);
    RobotMap.right3.enableBrakeMode(true);
    RobotMap.sL.SystemLoggerWriteTimeline("Left_Right_Brake_Mode_Disabled");
    org.usfirst.frc.team95.robot.RobotMap.switchVisionCameras();
    RobotMap.sL.SystemLoggerWriteTimeline("Vision_Cameras_Switched");
    if ((move) != null)
        move.stop();
    
}