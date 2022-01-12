@java.lang.Override
public void onCreate() {
    android.content.IntentFilter stateFilter = new android.content.IntentFilter();
    stateFilter.addAction(Intent.ACTION_SCREEN_ON);
    stateFilter.addAction(Intent.ACTION_SCREEN_OFF);
    stateFilter.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);
    registerReceiver(mIntentReceiver, stateFilter);
    android.preference.PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(sharedPreferecesListener);
    com.azi.tethermote.SwitchNotification.Check(this, ((com.azi.tethermote.WirelessTools.getRemoteTetherState(this)) != 1));
    startThread();
}