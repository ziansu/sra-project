public double getError() {
    double error = -1.0;
    if ((org.usfirst.frc3824.HolonomicDrive.subsystems.Forklift.presentPIDmode) == (org.usfirst.frc3824.HolonomicDrive.Constants.FORKLIFT_POSITION_MODE)) {
        error = positionPID.getError();
    }else {
        error = velocityPID.getError();
    }
    return error;
}