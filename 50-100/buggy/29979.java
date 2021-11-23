@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    android.support.v4.app.Fragment fragment;
    if ((tuhh.nme.mp.remote.WifiConnector.getWifiState()) == (tuhh.nme.mp.remote.WifiState.ENABLED)) {
        fragment = m_WifiChooserFragment.get();
    }else {
        fragment = m_WifiIsDisabledFragment.get();
    }
    getSupportFragmentManager().beginTransaction().add(R.id.MainActivity_fragment_frame, fragment).commit();
    tuhh.nme.mp.broadcasts.WifiBroadcastReceiver.attach(m_OnWifiDisabledListener);
    tuhh.nme.mp.broadcasts.WifiBroadcastReceiver.attach(m_OnWifiEnabledListener);
}