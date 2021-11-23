public static void initialize() {
    org.usfirst.frc.team2035.robot.OI.hangerSpin = org.usfirst.frc.team2035.robot.RobotMap.HANGERBUTTON_FORWARD;
    org.usfirst.frc.team2035.robot.OI.shiftGear = org.usfirst.frc.team2035.robot.RobotMap.SHIFT_GEAR;
    org.usfirst.frc.team2035.robot.OI.ballIn = org.usfirst.frc.team2035.robot.RobotMap.BALL_IN;
    org.usfirst.frc.team2035.robot.OI.ballOut = org.usfirst.frc.team2035.robot.RobotMap.BALL_OUT;
    org.usfirst.frc.team2035.robot.OI.armUp = org.usfirst.frc.team2035.robot.RobotMap.ARM_UP;
    org.usfirst.frc.team2035.robot.OI.armDown = org.usfirst.frc.team2035.robot.RobotMap.ARM_DOWN;
    org.usfirst.frc.team2035.robot.OI.hangerSpin.whileHeld(new org.usfirst.frc.team2035.robot.commands.HangerSpin());
    org.usfirst.frc.team2035.robot.OI.shiftGear.whileHeld(new org.usfirst.frc.team2035.robot.ShiftLowGear());
    org.usfirst.frc.team2035.robot.OI.ballIn.whileHeld(new org.usfirst.frc.team2035.robot.BallIntake());
    org.usfirst.frc.team2035.robot.OI.ballOut.whileHeld(new org.usfirst.frc.team2035.robot.BallOutake());
    org.usfirst.frc.team2035.robot.OI.armUp.whileHeld(new org.usfirst.frc.team2035.robot.ArmUp());
    org.usfirst.frc.team2035.robot.OI.armDown.whileHeld(new org.usfirst.frc.team2035.robot.ArmDown());
}