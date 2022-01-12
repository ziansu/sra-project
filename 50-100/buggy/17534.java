@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (android.preference.PreferenceManager.getDefaultSharedPreferences(app).getBoolean(DistanceTracker.PREF_TRACKING, false)) {
        android.widget.ToggleButton bTracking = ((android.widget.ToggleButton) (findViewById(R.id.buttonTracking)));
        bTracking.setChecked(true);
    }
    app = ((com.dtracker.DistanceTracker) (getApplication()));
}