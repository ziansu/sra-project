private boolean isLeft(int leftEyeX, int rightEyeX) {
    int leftLeftDistance = leftEyeX - (leftLeftTreshold);
    int leftRightDistance = rightEyeX - (leftRightTreshold);
    return (leftLeftDistance + leftRightDistance) < 0;
}