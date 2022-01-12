@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
    if ((i % 2) == 0) {
        com.leapfrog.inventorymanagementsystem.data.HawkUtils.setLanguage(com.leapfrog.inventorymanagementsystem.settings.SettingsActivity.Language.ENGLISH);
        tvLanguage.setText("EN");
    }else {
        com.leapfrog.inventorymanagementsystem.data.HawkUtils.setLanguage(com.leapfrog.inventorymanagementsystem.settings.SettingsActivity.Language.CHINESE);
        tvLanguage.setText("CN");
    }
}