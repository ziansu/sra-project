@java.lang.Override
protected void onPause() {
    android.util.Log.d(com.ponpongi.pongicounter.EditActivity.TAG, "onPause");
    android.util.Log.d(com.ponpongi.pongicounter.EditActivity.TAG, ("list size: " + (data_list.size())));
    android.content.SharedPreferences pref = getApplicationContext().getSharedPreferences(com.ponpongi.pongicounter.EditActivity.PREF_NAME, com.ponpongi.pongicounter.MODE_PRIVATE);
    com.ponpongi.pongicounter.utils.PreferenceUtils.dumpCounterData(pref, data_list);
    super.onPause();
}