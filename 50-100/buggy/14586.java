public double get_accuracy() {
    try {
        double acc = ((TP) + (TN)) / ((((TP) + (TN)) + (FP)) + (FN));
        if (acc > 1) {
            return 1;
        }else
            if (acc < 0) {
                return 0;
            }else {
                return acc;
            }
        
    } catch (java.lang.ArithmeticException e) {
        return 0;
    }
}