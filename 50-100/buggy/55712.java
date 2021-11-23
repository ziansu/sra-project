public static double polySpiralLength(int n, double base, int rounds) {
    double sum = 0.0;
    for (int i = 0; i < (rounds * n); i++) {
        sum += (i + 1) * base;
    }
    return sum;
}