public org.joda.time.format.DateTimeFormatter determineDayFormatter() {
    try {
        return (customTimestampFormat) == null ? org.joda.time.format.DateTimeFormat.forStyle(((dateStyle.getToken()) + "-")) : org.joda.time.format.DateTimeFormat.forPattern(customDayFormat);
    } catch (java.lang.IllegalArgumentException e) {
        de.jpaw.bonaparte.core.CSVConfiguration.LOGGER.error(("Provided format is not valid: " + (customDayFormat)), e);
        return org.joda.time.format.DateTimeFormat.forPattern(de.jpaw.bonaparte.core.CSVConfiguration.DEFAULT_DAY_FORMAT);
    }
}