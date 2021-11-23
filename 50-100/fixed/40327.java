private boolean areAllExamplesHaveSameClassValue(double[] ds) throws java.lang.Exception {
    double sum = 0;
    for (double d : ds) {
        sum += d;
    }
    for (double d : ds) {
        if (d == sum) {
            return true;
        }
    }
    return false;
}