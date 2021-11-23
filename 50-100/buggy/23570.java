private org.joda.time.DateTime parseDate(int day, java.lang.Integer month, java.lang.Integer year, boolean end) {
    return new org.joda.time.DateTime((year == null ? java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) : year), (month == null ? (java.util.Calendar.getInstance().get(java.util.Calendar.MONTH)) + 1 : month), day, (end ? 23 : 0), (end ? 59 : 0), (end ? 59 : 0));
}