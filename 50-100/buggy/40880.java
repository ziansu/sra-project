public static java.util.Date oldest(final java.util.Date... ds) {
    java.util.Date result = null;
    for (final java.util.Date d : ds) {
        if (d == null) {
            continue;
        }
        if (result == null) {
            result = d;
            continue;
        }
        if (d.before(result)) {
            result = d;
            continue;
        }
    }
    return result;
}