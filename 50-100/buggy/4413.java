@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    this.layout = R.layout.activity_wanhost;
    super.onCreate(savedInstanceState);
    this.wanHost = ((android.widget.EditText) (findViewById(R.id.hostAddress)));
    this.portList = ((android.widget.ListView) (findViewById(R.id.portList)));
    this.wanHost.setText(com.aaronjwood.portauthority.utils.UserPreference.getLastUsedHostAddress(this));
    this.adapter = new android.widget.ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, ports);
    this.portList.setAdapter(adapter);
    this.setupPortScan();
}