private boolean matchExact(java.util.Calendar matcher, org.json.JSONObject activity) {
    int year = java.lang.Integer.parseInt(activity.getString("year"));
    int month = java.lang.Integer.parseInt(activity.getString("month"));
    return ((matcher.get(java.util.Calendar.YEAR)) == year) && ((matcher.get(java.util.Calendar.MONTH)) == month);
}