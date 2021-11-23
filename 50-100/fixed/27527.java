public double getAverageOverFrequency() {
    double sum = 0;
    int count = 0;
    for (int i = 0; i < (data.length); i++) {
        if ((data[i]) != (-1)) {
            sum += data[i];
            count++;
        }
    }
    return sum / count;
}