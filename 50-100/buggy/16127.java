public int getEvenNumberSum() {
    int sum = 0;
    for (int i = 0; i < (index); i++) {
        boolean isTrue = checkEven(series[i]);
        if (isTrue) {
            sum += series[i];
        }
    }
    return sum;
}