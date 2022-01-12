public void trackSpin(boolean clockwise) {
    currentAngle += (clockwise) ? spinSpeed : -(spinSpeed);
}