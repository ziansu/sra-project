@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    com.azi.tethermote.SwitchNotification.Check(this, ((com.azi.tethermote.WirelessTools.getRemoteTetherState(this)) != (WirelessTools.TETHERING_ENABLED)));
}