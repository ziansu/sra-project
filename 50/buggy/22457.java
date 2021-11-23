public static double sqrt(double n) {
    if (n < 0) {
        throw new java.lang.IllegalArgumentException();
    }
    return Recursion.helper(n, 1, (-1));
}