@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    android.widget.Toast.makeText(this.getActivity(), R.string.home_widget_change, Toast.LENGTH_SHORT).show();
    return true;
}