private boolean isOutOfBounds_Up() {
    if ((robot.armMotor.getCurrentPosition()) < (max))
        return true;
    
    return false;
}