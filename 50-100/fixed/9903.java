@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object data) {
    final int pinStringLength = data.toString().length();
    if (pinStringLength != (info.dvkr.screenstream.SettingsActivity.PIN_DIGITS_COUNT)) {
        android.widget.Toast.makeText(getActivity().getApplicationContext(), getResources().getString(R.string.pin_digits_count), Toast.LENGTH_LONG).show();
        return false;
    }
    return true;
}