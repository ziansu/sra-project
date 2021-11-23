@java.lang.Override
protected void onResume() {
    super.onResume();
    if (prefs.getBoolean(com.pyrotemplar.kickballreferee.MainActivity.LEFTYMODE, false)) {
        setContentView(R.layout.lefty_activity_main);
    }else {
        setContentView(R.layout.righty_activity_main);
    }
    setupButtons();
    updateFields();
    android.util.Log.d(com.pyrotemplar.kickballreferee.MainActivity.LOG_TAG, "OnRsume is called");
}