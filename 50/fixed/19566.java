private long lowerBound(final java.lang.Long key) {
    return org.glassfish.jersey.server.internal.monitoring.AggregatingTrimmer.lowerBound(key, java.util.concurrent.TimeUnit.NANOSECONDS.convert(startTime, startUnitTime), chunkSize, org.glassfish.jersey.server.internal.monitoring.ReservoirConstants.COLLISION_BUFFER_POWER);
}