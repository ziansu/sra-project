public static double toStata(java.sql.Timestamp datetime) {
    java.time.Instant javadate = datetime.toInstant();
    return javadate.plus(org.paces.Stata.Utilities.StataXTTS.STATAOFFSET.toEpochMilli(), java.time.temporal.ChronoUnit.MILLIS).toEpochMilli();
}