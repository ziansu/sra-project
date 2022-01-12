@java.lang.Override
public void pidWrite(double output) {
    double angle = navigationSubsystem.getYaw();
    frontLeft.set((output + ((-angle) * (org.usfirst.frc.team5190.robot.subsystems.DriveTrainSubsystem.DriveStraightPIDOutput.kP))));
    frontRight.set((output + (angle * (org.usfirst.frc.team5190.robot.subsystems.DriveTrainSubsystem.DriveStraightPIDOutput.kP))));
}