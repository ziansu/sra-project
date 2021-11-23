@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    twIP = ((android.widget.TextView) (findViewById(R.id.idIpAddrEditText)));
    oldAddres = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getString("IP_ADDRESS", "");
    if ((oldAddres.compareTo("")) != 0) {
        twIP.setText(oldAddres);
    }else {
        twIP.setText("");
    }
}