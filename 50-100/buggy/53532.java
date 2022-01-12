public void setTimesFromDatabase(boolean runningFromActivity) {
    java.lang.String date = getDate();
    java.lang.String output = getPrayerTimesForDate(date, runningFromActivity);
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(output);
        setPrayerTime(jsonObject, runningFromActivity);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    startService(new android.content.Intent(this, com.byteshaft.namaztime.NamazTimeService.class));
}