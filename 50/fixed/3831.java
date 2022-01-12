public static double sqrt(double n) {
    if (n < 0) {
        throw new java.lang.IllegalArgumentException("The input is negative.");
    }
    if (n == 0.0) {
        return 0.0;
    }
    return Recursion.betterGuess(n, 1);
}