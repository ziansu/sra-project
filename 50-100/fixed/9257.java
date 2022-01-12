private boolean matchExact(java.util.Calendar matcher, org.json.JSONObject activity) {
    int year = activity.getInt("year");
    int month = activity.getInt("month");
    return ((matcher.get(java.util.Calendar.YEAR)) == year) && ((matcher.get(java.util.Calendar.MONTH)) == month);
}