public java.lang.String getOrdered_at_formated() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(ordered_at);
    int year = cal.get(java.util.Calendar.YEAR);
    int month = cal.get(java.util.Calendar.MONTH);
    int day = cal.get(java.util.Calendar.DAY_OF_MONTH);
    ordered_at_formated = ((((day + "-") + month) + 1) + "-") + year;
    return ordered_at_formated;
}