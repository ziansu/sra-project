public double get_error() {
    try {
        return ((FP) + (FN)) / ((((TP) + (TN)) + (FP)) + (FN));
    } catch (java.lang.ArithmeticException e) {
        return 0.0;
    }
}