public void getPreferences(final com.android.volley.Response.Listener<org.json.JSONObject> callback, final com.android.volley.Response.ErrorListener errHandler) {
    com.troubadour.troubadour.CustomClasses.TroubadourObjectRequest jsonObjectRequest = new com.troubadour.troubadour.CustomClasses.TroubadourObjectRequest(Request.Method.GET, ((apiURL) + "/preferences"), null, callback, errHandler);
    java.lang.String android_id = Settings.Secure.getString(com.troubadour.troubadour.CustomClasses.APIHandler.mCtx.getContentResolver(), Settings.Secure.ANDROID_ID);
    jsonObjectRequest.setHeader("X-USER-ID", android_id).setHeader("Content-Type", "application/json");
    mRequestQueue.add(jsonObjectRequest);
}