public void checkTripLengthDistribution(org.apache.commons.math.stat.Frequency travelTimes, double alpha, double gamma, java.lang.String fileName) {
    int[] timeThresholds1 = new int[79];
    double[] frequencyTT1 = new double[79];
    for (int row = 0; row < (timeThresholds1.length); row++) {
        timeThresholds1[row] = row + 1;
        frequencyTT1[row] = travelTimes.getCumPct(timeThresholds1[row]);
    }
    writeVectorToCSV(timeThresholds1, frequencyTT1, fileName, alpha, gamma);
}