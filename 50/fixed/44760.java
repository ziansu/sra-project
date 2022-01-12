@javax.annotation.Nullable
public static java.lang.Long dateToLong(@javax.annotation.Nullable
java.util.Date d) {
    if (d == null) {
        return null;
    }
    return d.getTime();
}