@java.lang.Override
protected void onViewCreated(final android.os.Bundle savedInstanceState) {
    this.getSupportActionBar().setDisplayShowTitleEnabled(false);
    this.mConfigurationSpinner = ((no.nordicsemi.android.nrftoolbox.widget.ClosableSpinner) (findViewById(R.id.toolbar_spinner)));
    this.mConfigurationSpinner.setOnItemSelectedListener(this);
    this.mConfigurationSpinner.setAdapter(mConfigurationsAdapter);
    this.mConfigurationSpinner.setSelection(mConfigurationsAdapter.getItemPosition(mPreferences.getLong(no.nordicsemi.android.nrftoolbox.uart.UARTActivity.PREFS_CONFIGURATION, 0)));
}