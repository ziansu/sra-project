public void run(double x) {
    if ((java.lang.Math.abs(math.pow(x, 3))) >= 0.1) {
        f.set(((yVal) / 2));
        b.set(((yVal) / 2));
    }else {
        f.set(0);
        b.set(0);
    }
}