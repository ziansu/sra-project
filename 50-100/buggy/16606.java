public void disabledInit() {
    RobotMap.sL.SystemLoggerWriteTimeline("Disabled_Init");
    RobotMap.left1.enableBrakeMode(false);
    RobotMap.left2.enableBrakeMode(false);
    RobotMap.left3.enableBrakeMode(false);
    RobotMap.right1.enableBrakeMode(false);
    RobotMap.right2.enableBrakeMode(false);
    RobotMap.right3.enableBrakeMode(false);
    RobotMap.sL.SystemLoggerWriteTimeline("Left_And_Right_Brake_Mode_Disabled");
}