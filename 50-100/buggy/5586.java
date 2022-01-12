@java.lang.Override
public void periodic() {
    if (checkStageTimeout()) {
        return ;
    }
    switch (stage) {
        case 0 :
            driveForward();
            break;
        case 1 :
            driveSideways();
            break;
    }
    robot.setDriveT(robot.gyro.getAngle());
    robot.robotDrive.mecanumDrive_Cartesian(robot.getDriveX(), robot.getDriveY(), robot.getDriveR(), robot.getDriveT());
}