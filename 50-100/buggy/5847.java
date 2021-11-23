public void readControlValues() {
    DELIN_POW = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getInt(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.DELIN_POW_KEY);
    DEADBAND_X = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.DEADBAND_X_KEY);
    DEADBAND_Y = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.DEADBAND_Y_KEY);
    DEADBAND_TWIST = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.DEADBAND_TWIST_KEY);
    TURN_OUTER_SPEED = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.TURN_OUTER_SPEED_KEY);
    TURN_INNER_SPEED = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.TURN_INNER_SPEED_KEY);
    CURRENT_LIMIT = edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.getNumber(org.usfirst.frc2619.PlyBot2017.subsystems.DriveTrain.CURRENT_LIMIT_KEY);
}