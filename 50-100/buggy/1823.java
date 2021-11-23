private static double helper(double n, double guess) {
    if ((((n - (guess * guess)) / n) <= 1.0E-15) && ((n - (guess * guess)) >= 0)) {
        return guess;
    }
    java.lang.System.out.println(guess);
    return Recursion.helper(n, (((n / guess) + guess) / 2));
}