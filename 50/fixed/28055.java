@java.lang.Override
protected boolean isFinished() {
    if ((java.lang.Math.abs(((java.lang.Math.floor(Robot.driveTrain.getAngle())) - (ANGLE)))) <= 2) {
        return true;
    }else {
        return false;
    }
}