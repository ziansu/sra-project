@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    this.layout = R.layout.activity_wanhost;
    super.onCreate(savedInstanceState);
    this.wanHost = ((android.widget.EditText) (findViewById(R.id.hostAddress)));
    this.portList = ((android.widget.ListView) (findViewById(R.id.portList)));
    this.wanHost.setText(com.aaronjwood.portauthority.utils.UserPreference.getLastUsedHostAddress(this));
    this.setupPortScan();
}