public double calculateDistance(int rssi, int frequence) {
    double distance = 0;
    distance = (((org.fixus.wifitesting.utils.WifiScanner.K) - (20 * (java.lang.Math.log10(frequence)))) + (java.lang.Math.abs(rssi))) / 20.0;
    distance = java.lang.Math.pow(10.0, distance);
    return distance;
}