@javax.annotation.Nullable
public static org.dbtools.android.domain.LocalDateTime longToLocalDateTimeUtc(@javax.annotation.Nullable
java.lang.Long l) {
    if (l == null) {
        return null;
    }
    return org.dbtools.android.domain.Instant.ofEpochMilli(l).atZone(ZoneOffset.UTC).toLocalDateTime();
}