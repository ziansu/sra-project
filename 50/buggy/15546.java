public long getHoursBetweenBedandMidnight() {
    long hoursBetweenBedandMidnight = java.time.temporal.ChronoUnit.HOURS.between(bed, midnight);
    hoursBetweenBedandMidnight = hoursBetweenBedandMidnight * (-1);
    long middleNightPay = hoursBetweenBedandMidnight * (rateBetweenBedandMidnight);
    return middleNightPay;
}