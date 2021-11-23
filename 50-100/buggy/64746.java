@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    cat.ereza.customactivityoncrash.CustomActivityOnCrash.install(this);
    setContentView(R.layout.activity_start);
    if (!(getSharedPreferences("data", com.z3r0byte.magis.MODE_PRIVATE).getBoolean("LoggedIn", false))) {
        startActivity(new android.content.Intent(this, com.z3r0byte.magis.SetupActivity.class));
        finish();
    }else {
        startActivity(new android.content.Intent(this, com.z3r0byte.magis.CalendarActivity.class));
    }
}