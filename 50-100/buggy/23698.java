@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tcpClient = me.nallen.fox.app.TcpClient.getInstance();
    tcpClient.addDataListener(this);
    if (!(tcpClient.isConnected())) {
        mPrefs = getSharedPreferences(me.nallen.fox.app.MainActivity.PREFS_NAME, me.nallen.fox.app.MODE_PRIVATE);
        showConnectPage();
    }
}