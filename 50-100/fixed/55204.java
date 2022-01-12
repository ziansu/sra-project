@java.lang.Override
public void onConnected() {
    if (!(myBlueTooth.hasSupport())) {
        android.widget.Toast.makeText(getActivity(), "Bluetooth LE is not supported", Toast.LENGTH_SHORT).show();
        getActivity().finish();
    }else {
        addPreferencesFromResource(R.xml.pref_settings_general);
        setPreferenceScreenDeviceAdd();
        setPreferenceScreenConfigured();
        setSaveButton();
        setCancelButton();
    }
}