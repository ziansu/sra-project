@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object o) {
    if (sp_autocheck.isChecked()) {
        check_wifi.setEnabled(true);
        check_list.setEnabled(true);
        startTimer();
    }else {
        if ((cdt) != null)
            cdt.cancel();
        
        check_wifi.setEnabled(false);
        check_list.setEnabled(false);
    }
    return true;
}