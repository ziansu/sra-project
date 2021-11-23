@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceBundle) {
    super.onCreate(savedInstanceBundle);
    setContentView(R.layout.add_schedule);
    android.os.Bundle args = getIntent().getExtras();
    if (args != null) {
        day = args.getInt(com.technosales.mobitrack.AddScheduleActivity.ARG_DAY, 1);
    }
    initialize();
}