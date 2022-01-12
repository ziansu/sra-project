public static final boolean betweenTwoValues(float position, float lowerBound, float upperBound) {
    if (lowerBound < upperBound) {
        return (position >= lowerBound) && (position <= upperBound);
    }
    return false;
}