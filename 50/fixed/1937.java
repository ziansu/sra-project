@java.lang.Override
public void onResume() {
    super.onResume();
    if ((ch.ethz.tik.hrouting.SettingsFragment.alertDialog) != null)
        ch.ethz.tik.hrouting.SettingsFragment.alertDialog.show();
    
}