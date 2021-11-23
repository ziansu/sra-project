private static double sqrtHelper(double n, double guess) {
    if (Recursion.isCloseEnough((guess * guess), n)) {
        return guess;
    }else {
        int better_guess = ((n / guess) + guess) / 2;
        Recursion.sqrtHelper(n, better_guess);
    }
}