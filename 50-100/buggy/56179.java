public double mean() {
    double meanSum = 0;
    for (int i = 0; i < (totalTests); i++) {
        meanSum += ((double) (openSites[i])) / (totalSites);
        java.lang.System.out.println(openSites[i]);
    }
    return meanSum / (totalTests);
}