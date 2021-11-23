private void setupAdControl() {
    android.widget.Switch adSwitch = ((android.widget.Switch) (findViewById(R.id.switch_ads)));
    adSwitch.setChecked(mPreferences.getBoolean("showAds", true));
    adSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {
        @java.lang.Override
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean isChecked) {
            mPreferences.edit().putBoolean("showAds", isChecked).apply();
            android.widget.Toast.makeText(com.rastamas.warhammerquoteoftheday.SettingsActivity.this, "Restart application for the changes to take effect!", Toast.LENGTH_LONG).show();
        }
    });
}