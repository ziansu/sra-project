@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    org.json.JSONObject json;
    try {
        json = new org.json.JSONObject(getJSON(mContext.getString(R.string.db_get_database), 5000));
        int success = json.getInt(com.example.alex.qtapandroid.common.GetCloudDb.TAG_SUCCESS);
        if (success == 1) {
            cloudToPhoneDB(json);
        }
    } catch (org.json.JSONException e) {
        android.util.Log.d("HELLOTHERE", ("BAD: " + e));
    }
    return null;
}