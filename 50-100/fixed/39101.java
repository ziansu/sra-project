public static org.votingsystem.util.DateUtils.TimePeriod parse(net.sf.json.JSONObject jsonData) throws java.text.ParseException, net.sf.json.JSONException {
    java.util.Date dateFrom = org.votingsystem.util.DateUtils.getDateFromString(jsonData.getString("dateFrom"));
    java.util.Date dateTo = org.votingsystem.util.DateUtils.getDateFromString(jsonData.getString("dateTo"));
    return new org.votingsystem.util.DateUtils.TimePeriod(dateFrom, dateTo);
}