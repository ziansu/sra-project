@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(com.runafter.wtt.fragments.DashboardFragment.TAG, "onCreate");
    this.handler = new android.os.Handler();
    this.timeFormat = new java.text.SimpleDateFormat("HH:mm:ss");
    this.timeZoneOffset = timeZoneOffset();
    android.util.Log.d(com.runafter.wtt.fragments.DashboardFragment.TAG, "onCreate finish");
}