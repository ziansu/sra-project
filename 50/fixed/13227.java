public double confidenceLo() {
    return (mean()) - ((1.96 * (stddev())) / (java.lang.Math.sqrt(percThreshold.length)));
}