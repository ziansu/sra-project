private double average(double[] returns, java.util.function.Predicate<java.lang.Integer> filter) {
    double sum = 0;
    int count = 0;
    for (int ii = 0; ii < (returns.length); ii++) {
        if (!(filter.test(ii)))
            continue;
        
        sum += returns[ii];
        count++;
    }
    return sum / count;
}