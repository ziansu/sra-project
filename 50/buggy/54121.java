public long getYearsLength() {
    return java.time.temporal.ChronoUnit.YEARS.between(startDate, endDate);
}