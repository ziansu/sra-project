public void multiply(@IntRange(from = -5, to = 5)
int a, @IntRange(from = 10, to = 20)
int b, @IntRange(from = -20, to = -10)
int c) {
    @IntRange(from = -100, to = 99)
    int mult1 = a * b;
    @IntRange(from = -100, to = 100)
    int mult2 = a * b;
    @IntRange(from = -100, to = 99)
    int mult3 = a * c;
    @IntRange(from = -100, to = 100)
    int mult4 = a * c;
    @IntRange(from = -400, to = -101)
    int mult5 = b * c;
    @IntRange(from = -400, to = -100)
    int mult6 = b * c;
    double d = 10.0;
    double e = d - a;
}