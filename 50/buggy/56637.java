public double get_precision() {
    try {
        double precision = (TP) / ((TP) + (FP));
        return precision;
    } catch (java.lang.ArithmeticException e) {
        return 0.0;
    }
}