private boolean isAutoAddDate(com.parse.ParseObject stash) {
    java.lang.String autoAddOn = stash.getString("AutoAddOn");
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("MM/dd/yyyy");
    java.util.Date autoAddOnDate;
    try {
        autoAddOnDate = dateFormat.parse(autoAddOn);
        return android.text.format.DateUtils.isToday(autoAddOnDate.getTime());
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return false;
}