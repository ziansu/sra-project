public float calculateDistanceSince(java.time.Instant t1) throws devices.encoder.Encoder.DirectionChange {
    if (directionEvents.get(0).eTime.isAfter(t1))
        throw new devices.encoder.Encoder.DirectionChange();
    
    lastDistance = distance;
    float rotations = ((float) (CountPinEventsSince(t1))) / 4.0F;
    distance = rotations / (motorRotationsPerMetre);
    return distance;
}