public int getEvenNumberSum() {
    int sum = 0;
    for (int i = 0; i < (index); i++) {
        if (checkEven(series[i])) {
            sum += series[i];
        }
    }
    return sum;
}