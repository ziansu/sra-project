public double N(double n) {
    int i = 0;
    double sum = 1;
    for (i = 1; i <= n; i++) {
        sum = sum * i;
    }
    return sum;
}