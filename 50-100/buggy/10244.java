private double average(java.util.Date[] dates, double[] returns, int skip, java.util.function.Predicate<java.util.Date> filter) {
    double sum = 0;
    int count = 0;
    for (int ii = skip; ii < (returns.length); ii++) {
        if (!(filter.test(dates[ii])))
            continue;
        
        sum += returns[ii];
        count++;
    }
    return sum / count;
}