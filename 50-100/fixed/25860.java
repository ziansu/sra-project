@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    int id = buttonView.getId();
    switch (id) {
        case R.id.switch_theme :
            themeChanged = true;
            if (isChecked) {
                settingsManager.setThemeDark();
            }else {
                settingsManager.setThemeLight();
            }
            break;
        case R.id.switch_logout :
            if (isChecked) {
                settingsManager.setAlwaysLogout(true);
            }else {
                settingsManager.setAlwaysLogout(false);
            }
            break;
    }
}