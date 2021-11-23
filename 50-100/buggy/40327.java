private boolean areAllExamplesHaveSameClassValue(double[] ds) throws java.lang.Exception {
    int zero = 0;
    for (double d : ds) {
        if (d == 0) {
            ++zero;
        }
    }
    return zero == ((ds.length) - 1);
}