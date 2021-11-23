@java.lang.Override
protected android.content.Intent doInBackground(java.lang.String... params) {
    java.lang.String res = utils.WebUtils.executePost(url, paramsInsert);
    if (!(com.google.common.base.Strings.isNullOrEmpty(res))) {
        try {
            org.json.JSONObject resJson = new org.json.JSONObject(res);
            si.krivec.tracker.TrackingActivity.idRoute = resJson.getInt("idRoute");
        } catch (org.json.JSONException ex) {
            android.util.Log.d("ROUTES insertNewRoute", ex.getMessage());
        }
    }
    android.util.Log.d("ROUTES insertNewRoute", res);
    return null;
}