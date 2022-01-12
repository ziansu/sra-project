public static int maxInBounds(int[] A, int lowerBound, int upperBound) {
    int max = 0;
    int[] bounds = new int[]{ lowerBound , upperBound };
    for (int i = MyMath.min(bounds); i < ((MyMath.max(bounds)) + 1); i++) {
        max = java.lang.Math.max(A[i], max);
    }
    return max;
}