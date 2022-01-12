public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (checkPlayServices()) {
        java.lang.String mRegID = org.universAAL.android.utils.RAPIManager.getRegistrationId(getApplicationContext());
        if (!(mRegID.equals(((java.lang.String) (newValue))))) {
            org.universAAL.android.utils.RAPIManager.registerInThread(getApplicationContext());
        }
        return true;
    }else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.warning_gplay, Toast.LENGTH_LONG).show();
        return false;
    }
}