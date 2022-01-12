@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.TextView ipAddrTV = ((android.widget.TextView) (findViewById(R.id.ipAddressTV)));
    ipAddrTV.setText(getIpAddress());
    checkAndGetPermissions();
    android.content.Intent serverIntent = new android.content.Intent(this, ca.tetchel.shexter.SmsServerService.class);
    if (!(isServiceRunning(ca.tetchel.shexter.SmsServerService.class))) {
        startService(serverIntent);
    }
}