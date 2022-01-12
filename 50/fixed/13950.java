@javax.annotation.Nullable
public static org.joda.time.DateTime longToDateTime(@javax.annotation.Nullable
java.lang.Long l) {
    if (l == null) {
        return null;
    }
    return new org.joda.time.DateTime(l);
}