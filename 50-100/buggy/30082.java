public static boolean computeStrategy2(java.util.NavigableMap<java.time.LocalTime, java.lang.Double> tm) {
    if ((((apidemo.Analysis.getMaxAMT(tm).isAfter(java.time.LocalTime.of(10, 30))) && (apidemo.Analysis.getMinAMT(tm).isBefore(java.time.LocalTime.of(10, 0)))) && ((apidemo.Analysis.getPercentile(tm)) > 50)) && ((apidemo.Analysis.drawDownCompute(tm)) < 50)) {
        return true;
    }
    return false;
}