private java.lang.String getCalibrationValue(final java.lang.String[] splittedCalibrationString, final java.lang.String key) {
    for (java.lang.String line : splittedCalibrationString) {
        line = line.trim();
        final int idx = line.indexOf(key);
        if (idx == (-1))
            break;
        
        return line.substring((idx + (key.length())));
    }
    return java.lang.String.valueOf(java.lang.Double.NaN);
}