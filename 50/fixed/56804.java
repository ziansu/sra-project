private long minutesRemaining(long endDateMillis) {
    double differenceMinutes = millisToMinutes(java.lang.System.currentTimeMillis(), endDateMillis);
    if (differenceMinutes < 0)
        return 0;
    else
        return java.lang.Math.round(differenceMinutes);
    
}