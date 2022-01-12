public double average() {
    double sum = 0;
    if ((this.len) == 0) {
        throw new java.lang.IllegalArgumentException();
    }
    for (int i = 0; i < (this.len); ++i) {
        sum += this.temperatureSeries[i];
    }
    return sum / (this.temperatureSeries.length);
}