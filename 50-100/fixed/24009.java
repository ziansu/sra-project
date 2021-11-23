public double get_error() {
    if ((((FP) + (FN)) == 0) || (((((TP) + (TN)) + (FP)) + (FN)) == 0)) {
        return 0;
    }else {
        return ((FP) + (FN)) / ((((TP) + (TN)) + (FP)) + (FN));
    }
}