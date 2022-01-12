public org.joda.time.DateTime clampDateTime(org.joda.time.DateTime dateTime) {
    if (org.joda.time.DateTime.now().withZone(DateTimeZone.UTC).isAfter(org.atlasapi.output.writers.time.UnixMillenniumBugFixer.FIX_DISABLE_DATE_TIME)) {
        return dateTime;
    }
    if (dateTime.isAfter(org.atlasapi.output.writers.time.UnixMillenniumBugFixer.MAX_ALLOWED_DATE_TIME)) {
        return org.atlasapi.output.writers.time.UnixMillenniumBugFixer.MAX_ALLOWED_DATE_TIME.withZone(dateTime.getZone());
    }
    return dateTime;
}