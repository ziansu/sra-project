public void setMotorSpeeds(double left, double right, boolean usePID) {
    double scale = java.lang.Math.max(java.lang.Math.abs(left), java.lang.Math.abs(right));
    if (scale > 1) {
        left = left / scale;
        right = right / scale;
    }
    mLeftDrive.setSpeed(left);
    mLeftDrive.setUsePID(usePID);
    mRightDrive.setSpeed(right);
    mRightDrive.setUsePID(usePID);
}