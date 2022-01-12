private static float returnDifference(float firstNum, float secNum, float differenceNum) {
    float difference = java.lang.Math.abs((firstNum - secNum));
    float remainder = difference / differenceNum;
    return remainder;
}