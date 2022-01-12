@java.lang.Override
public void onClick(android.view.View view) {
    ch.dissem.apps.abit.util.Preferences.setWifiOnly(this, false);
    finish();
}