@java.lang.Override
protected void onPostExecute(org.json.JSONObject jsonObject) {
    super.onPostExecute(jsonObject);
    if (jsonObject != null) {
        try {
            friends = jsonObject.getJSONObject("friends").toString();
        } catch (org.json.JSONException e) {
            android.util.Log.e(MY_LOG, "JSON error", e);
        }
        android.util.Log.i(MY_LOG, ("friends=" + (friends)));
        android.content.Intent intent = new android.content.Intent(this, hyperactive.co.il.myfacebookapp.ShareActivity.class);
        intent.putExtra("friendsList", friends);
        startActivity(intent);
    }
}