public static final boolean overlapsBetweenTwoSides(float position, float halfSpan, float lowerBound, float upperBound) {
    return com.udacity.gamedev.gigagal.util.Utils.betweenTwoValues(position, (lowerBound - halfSpan), (upperBound + halfSpan));
}