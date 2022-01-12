@javax.annotation.Nullable
public static java.lang.Long dateTimeToLong(@javax.annotation.Nullable
org.joda.time.DateTime d) {
    if (d == null) {
        return null;
    }
    return d.getMillis();
}