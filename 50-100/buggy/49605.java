private boolean validateSettings() {
    android.widget.EditText telephoneTextView = ((android.widget.EditText) (findViewById(R.id.SettingsTelephoneNumber)));
    java.lang.String telephoneNumber = telephoneTextView.getText().toString();
    android.telephony.PhoneNumberUtils phoneNumbersUtility = new android.telephony.PhoneNumberUtils();
    android.util.Log.v(com.projects.dawid.movedetector.Settings.TAG, ("Number to check is: " + telephoneNumber));
    if (phoneNumbersUtility.isGlobalPhoneNumber(telephoneNumber))
        return true;
    else {
        android.widget.Toast.makeText(this, getString(R.string.validationWrongNumber), Toast.LENGTH_LONG).show();
        return false;
    }
}