public double byteToGigabyte(java.lang.Double num) {
    int divisor = 1000;
    return engine.DriveUtils.round((((num / divisor) / divisor) / divisor), 2);
}