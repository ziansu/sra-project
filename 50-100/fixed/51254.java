@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.SharedPreferences prefs = this.getSharedPreferences("au.com.shifttech", 0);
    textView = ((android.widget.TextView) (this.findViewById(R.id.infoText)));
    info2 = ((android.widget.TextView) (this.findViewById(R.id.info2)));
    au.com.patricklabes.sleepeasy.BatteryChecker bc = new au.com.patricklabes.sleepeasy.BatteryChecker();
    bc.setAlarm(getApplicationContext());
}