public static org.dbtools.android.domain.LocalDateTime longToLocalDateTimeUtc(long l) {
    return org.dbtools.android.domain.Instant.ofEpochMilli(l).atZone(ZoneOffset.UTC).toLocalDateTime();
}