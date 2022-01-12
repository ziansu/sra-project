@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_server);
    android.util.Log.d("SERVICE", "nani");
    startService(new android.content.Intent(this, aybars.arslan.menudroid_server.services.MyService.class));
    sqliteoperation = new aybars.arslan.menudroid_server.db.SqlOperations(getApplicationContext());
    sqliteoperation.open();
    tvIP = ((android.widget.TextView) (findViewById(R.id.tvIP)));
    getDeviceIpAddress();
    doLoopProcess();
}