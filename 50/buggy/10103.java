public static java.util.Date makeUpperBound(java.util.Date endDate) {
    return new org.joda.time.DateTime(endDate).withTime(23, 59, 59, 0).toDate();
}