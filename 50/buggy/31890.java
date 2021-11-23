public double mean() {
    double sum = 0;
    for (double i : this.p) {
        sum += i;
    }
    return sum / (this.T);
}