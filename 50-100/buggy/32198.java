private void setupServiceEnabledSwitch(android.support.v7.widget.SwitchCompat serviceEnabledSwitch) {
    serviceEnabledSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {
        @java.lang.Override
        public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
            enableService(isChecked);
        }
    });
    boolean isServiceEnabled = ph.intrepidstream.callmanager.util.PreferenceManager.getInstance(this).isServiceEnabled();
    serviceEnabledSwitch.setChecked(isServiceEnabled);
}