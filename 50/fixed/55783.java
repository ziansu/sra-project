@java.lang.Override
public double pidGet() {
    java.lang.System.out.println(((Robot.mDriveTrain.mLeftMotor1.getEncPosition()) / (Robot.mDriveTrain.mInchesToEncoderUnits)));
    return (Robot.mDriveTrain.mLeftMotor1.getEncPosition()) / (Robot.mDriveTrain.mInchesToEncoderUnits);
}