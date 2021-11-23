private java.lang.String getTimeFields() {
    java.lang.String url = "/plugin/get.timeFields";
    android.util.Log.d(TAG, ("Url is: " + url));
    com.baasbox.android.BaasResult<com.baasbox.android.json.JsonObject> result = com.baasbox.android.BaasBox.rest().sync(Rest.Method.GET, url);
    java.lang.String timeField;
    try {
        timeField = result.get().getObject("data").getString("timeField");
    } catch (com.baasbox.android.BaasException e) {
        timeField = null;
        e.printStackTrace();
    }
    return timeField;
}