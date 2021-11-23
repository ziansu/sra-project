public java.util.Collection<java.lang.String> getAllPatternsBetween(java.time.ZonedDateTime start, java.time.ZonedDateTime end) {
    return com.github.omribromberg.elasticsearch.datemath.formatter.DateMathFormatter.getAllPatternsBetween(start, end, lowestField.getTemporal().getBaseUnit(), formatter);
}