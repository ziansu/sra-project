@javax.annotation.Nullable
public static java.lang.Long localDateTimeToLong(@javax.annotation.Nullable
org.dbtools.android.domain.LocalDateTime d) {
    if (d == null) {
        return null;
    }
    return d.atZone(org.dbtools.android.domain.ZoneId.systemDefault()).toInstant().toEpochMilli();
}