@javax.annotation.Nullable
public static java.util.Date longToDate(@javax.annotation.Nullable
java.lang.Long l) {
    if (l == null) {
        return null;
    }
    return new java.util.Date(l);
}