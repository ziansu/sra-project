public float calculateSpeed() {
    time = java.time.Instant.now(clock);
    java.time.Instant startTime = time.minusMillis(DEFAULT_INTERVAL_MS);
    if (directionEvents.get(0).getTime().isAfter(startTime))
        startTime = directionEvents.get(0).getTime().plusMillis(1);
    
    try {
        return calculateAverageSpeedSince(startTime);
    } catch (devices.encoder.Encoder.DirectionChange e) {
        return -999.0F;
    }
}