@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_order_map);
    context = this;
    android.telephony.TelephonyManager tMgr = ((android.telephony.TelephonyManager) (this.getSystemService(Context.TELEPHONY_SERVICE)));
    phoneNumber = tMgr.getLine1Number();
    mProgressView = findViewById(R.id.order_map_progress);
    initInputs();
    setUpMapIfNeeded();
}