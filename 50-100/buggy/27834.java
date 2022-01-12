@java.lang.Override
protected void onResume() {
    super.onResume();
    updateFields();
    if (prefs.getBoolean(com.pyrotemplar.kickballreferee.MainActivity.LEFTYMODE, false))
        setContentView(R.layout.lefty_activity_main);
    else
        setContentView(R.layout.righty_activity_main);
    
    setupButtons();
    android.util.Log.d(com.pyrotemplar.kickballreferee.MainActivity.LOG_TAG, "OnRsume is called");
}