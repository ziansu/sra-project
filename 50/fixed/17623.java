private static java.lang.String toDateString(java.util.Date date) {
    return date != null ? io.tenmax.cqlkit.RowUtils.dateFormat.format(date) : null;
}