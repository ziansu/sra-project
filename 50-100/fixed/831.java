public static void initializeDriveTrain() {
    org.usfirst.frc.team5818.robot.subsystems.DriveTrain.TALON_MOTOR_FR = new edu.wpi.first.wpilibj.CANTalon(org.usfirst.frc.team5818.robot.RobotMap.TALON_FR);
    org.usfirst.frc.team5818.robot.subsystems.DriveTrain.TALON_MOTOR_BR = new edu.wpi.first.wpilibj.CANTalon(org.usfirst.frc.team5818.robot.RobotMap.TALON_BR);
    org.usfirst.frc.team5818.robot.subsystems.DriveTrain.TALON_MOTOR_MR = new edu.wpi.first.wpilibj.CANTalon(org.usfirst.frc.team5818.robot.RobotMap.TALON_MR);
    org.usfirst.frc.team5818.robot.subsystems.DriveTrain.TALON_MOTOR_FL = new edu.wpi.first.wpilibj.CANTalon(org.usfirst.frc.team5818.robot.RobotMap.TALON_FL);
    org.usfirst.frc.team5818.robot.subsystems.DriveTrain.TALON_MOTOR_BL = new edu.wpi.first.wpilibj.CANTalon(org.usfirst.frc.team5818.robot.RobotMap.TALON_BL);
    org.usfirst.frc.team5818.robot.subsystems.DriveTrain.TALON_MOTOR_ML = new edu.wpi.first.wpilibj.CANTalon(org.usfirst.frc.team5818.robot.RobotMap.TALON_MR);
}