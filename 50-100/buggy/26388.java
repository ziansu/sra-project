@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
    android.util.Log.e("asd", ("" + i));
    switch (i) {
        case 1 :
            com.leapfrog.inventorymanagementsystem.data.HawkUtils.setLanguage(com.leapfrog.inventorymanagementsystem.settings.SettingsActivity.Language.CHINESE);
            tvLanguage.setText("CN");
            break;
        case 2 :
            com.leapfrog.inventorymanagementsystem.data.HawkUtils.setLanguage(com.leapfrog.inventorymanagementsystem.settings.SettingsActivity.Language.ENGLISH);
            tvLanguage.setText("EN");
            break;
    }
}