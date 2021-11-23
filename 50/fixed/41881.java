public static java.time.LocalDateTime floorDate(java.time.LocalDateTime dateTime) {
    if (dateTime == null)
        return null;
    
    return dateTime.toLocalDate().atTime(0, 0);
}