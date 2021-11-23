public static double sqrt(double n) {
    if (n < 0)
        throw new java.lang.IllegalArgumentException();
    else {
        return Recursion.rHelper(n, 1);
    }
}