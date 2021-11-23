private void operatorControl() {
    if ((isOperatorControl()) && (isEnabled())) {
        org.usfirst.frc.team5811.robot.Timer.delay(0.02);
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("IMU_Byte_Count", ahrs.getByteCount());
        edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putNumber("IMU_Update_Count", ahrs.getUpdateCount());
    }
}