public void setMotorSpeeds(double left, double right, boolean usePID) {
    double scale = java.lang.Math.max(left, right);
    if (scale > 1) {
        left = left / scale;
        right = right / scale;
    }
    mLeftDrive.setSpeed(left);
    mLeftDrive.setUsePID(usePID);
    mRightDrive.setSpeed(right);
    mRightDrive.setUsePID(usePID);
}