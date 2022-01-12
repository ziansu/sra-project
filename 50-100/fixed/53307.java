@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (!(tz.co.wadau.calenderapp.InitialSettingsActivity.isFirstRun(getApplicationContext()))) {
        startActivity(new android.content.Intent(this, tz.co.wadau.calenderapp.CalendarApp.class));
    }else {
        startActivity(new android.content.Intent(this, tz.co.wadau.calenderapp.InitialSettingsActivity.class));
    }
    finish();
}