public double get_precision() {
    if (((TP) + (FP)) == 0) {
        return 0;
    }else {
        return (TP) / ((TP) + (FP));
    }
}