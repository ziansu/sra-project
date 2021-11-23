public void subtract(@IntRange(from = -5, to = 5)
int a, @IntRange(from = 10, to = 20)
int b) {
    @IntRange(from = -25, to = -6)
    int minus1 = a - b;
    @IntRange(from = -25, to = -5)
    int minus2 = a - b;
    double c = 4.0;
    double d = c - a;
}