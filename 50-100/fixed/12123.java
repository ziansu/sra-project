public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (checkPlayServices()) {
        org.universAAL.android.utils.RAPIManager.registerInThread(getApplicationContext(), ((java.lang.String) (newValue)));
        return true;
    }else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.warning_gplay, Toast.LENGTH_LONG).show();
        return false;
    }
}