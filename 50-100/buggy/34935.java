@java.lang.Override
protected void onViewCreated(final android.os.Bundle savedInstanceState) {
    getSupportActionBar().setDisplayShowTitleEnabled(false);
    final no.nordicsemi.android.nrftoolbox.widget.ClosableSpinner configurationSpinner = mConfigurationSpinner = ((no.nordicsemi.android.nrftoolbox.widget.ClosableSpinner) (findViewById(R.id.toolbar_spinner)));
    configurationSpinner.setOnItemSelectedListener(this);
    configurationSpinner.setAdapter(mConfigurationsAdapter);
    configurationSpinner.setSelection(mConfigurationsAdapter.getItemPosition(mPreferences.getLong(no.nordicsemi.android.nrftoolbox.uart.UARTActivity.PREFS_CONFIGURATION, 0)));
}