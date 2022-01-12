public double getAverageOverFrequency() {
    int ans = 0;
    double count = 0.0;
    for (int i = 0; i < (data.length); i++) {
        if ((data[i]) != (-1)) {
            ans += data[i];
        }else {
            count++;
        }
    }
    return ans / ((data.length) - count);
}