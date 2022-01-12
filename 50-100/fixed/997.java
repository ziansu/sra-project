long timeTrainGoesTo(java.lang.String target, java.util.Date currentTime) {
    if (target == null)
        throw new java.lang.NullPointerException("Station name cannot be null");
    
    if (currentTime == null)
        throw new java.lang.NullPointerException("Time name cannot be null");
    
    if (!(intermediateStationStorage.contains(target)))
        throw new java.util.NoSuchElementException("Train doesn't go to this station");
    
    return (time.getTime()) - (currentTime.getTime());
}