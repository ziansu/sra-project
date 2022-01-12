public void run(double x) {
    double yVal = math.pow(x, 3);
    if ((java.lang.Math.abs(yVal)) >= 0) {
        f.set((yVal / 2));
        b.set((yVal / 2));
    }
}