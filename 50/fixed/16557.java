public java.lang.Double getSumOfResults() {
    double sum = 0;
    for (int i = 0; i < (results.length); i++) {
        sum += results[i];
    }
    return sum;
}