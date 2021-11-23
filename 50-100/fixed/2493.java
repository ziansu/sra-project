public static org.joda.time.DateTime parseDateTime(java.lang.String timestamp) {
    if (timestamp != null) {
        for (org.joda.time.format.DateTimeFormatter formatter : com.google.api.ads.adwords.awreporting.model.util.DateUtil.formatters) {
            try {
                org.joda.time.LocalDateTime localDateTime = formatter.parseLocalDateTime(timestamp);
                return localDateTime.toDateTime(DateTimeZone.UTC);
            } catch (java.lang.IllegalArgumentException e) {
            }
        }
    }
    return null;
}