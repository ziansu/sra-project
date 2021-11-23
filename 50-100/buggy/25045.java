protected boolean isFinished() {
    if (((Robot.driveTrain.getLeftDistanceInches()) <= ((end) - 3)) && ((Robot.driveTrain.getLeftDistanceInches()) >= ((end) + 3)))
        return true;
    else
        return false;
    
}