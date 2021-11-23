public static java.math.BigInteger toMicro(java.time.Duration duration) {
    java.math.BigInteger ret = java.math.BigInteger.valueOf(duration.getSeconds());
    ret = ret.multiply(org.csstudio.archive.influxdb.InfluxDBUtil.micromult);
    ret = ret.add(java.math.BigInteger.valueOf(((duration.getNano()) / 1000)));
    return ret;
}