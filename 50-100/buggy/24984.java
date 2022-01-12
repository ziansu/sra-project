public static boolean isBetween(java.time.LocalTime lt, java.time.LocalTime startTime, java.time.LocalTime endTime) {
    if (startTime == null)
        startTime = java.time.LocalTime.of(0, 0);
    else
        if (endTime == null)
            endTime = java.time.LocalTime.of(23, 0);
        
    
    return ((lt.compareTo(startTime)) >= 0) && ((lt.compareTo(endTime)) <= 0);
}