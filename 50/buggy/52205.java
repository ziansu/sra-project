private java.lang.Boolean betweenOrBefore(final java.util.Date date, final java.util.Date fromDate, final java.util.Date toDate) {
    final java.lang.Boolean result = (between(date, fromDate, toDate)) || (date.before(fromDate));
    return result;
}