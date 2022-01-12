private double mean() {
    double total = 0;
    double n = 0;
    for (java.lang.Double val : values) {
        if (val == null)
            continue;
        
        n += 1.0;
        total += n;
    }
    return n == 0 ? 0 : total / n;
}