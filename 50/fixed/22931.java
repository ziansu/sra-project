public double sqrt(double n) {
    double guess = 1;
    if (n == 0) {
        return 0;
    }else {
        return Recursion.helper(n, guess);
    }
}