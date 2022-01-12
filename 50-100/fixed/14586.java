public double get_accuracy() {
    double acc = ((TP) + (TN)) / ((((TP) + (TN)) + (FP)) + (FN));
    if (((((TP) + (TN)) + (FP)) + (FN)) == 0) {
        return 0;
    }else {
        return acc;
    }
}