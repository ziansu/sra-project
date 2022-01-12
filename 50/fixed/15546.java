public long getHoursBetweenBedandMidnight() {
    long hoursBetweenBedandMidnight = java.time.temporal.ChronoUnit.HOURS.between(bed, midnight);
    long middleNightPay = hoursBetweenBedandMidnight * (rateBetweenBedandMidnight);
    return middleNightPay;
}