@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.setting_changeCN)) {
        switchLanguage(this, "china");
        ai.olami.android.example.Config.setLocalizeOption(APIConfiguration.LOCALIZE_OPTION_SIMPLIFIED_CHINESE);
    }else
        if (id == (R.id.setting_changeTW)) {
            switchLanguage(this, "taiwan");
            ai.olami.android.example.Config.setLocalizeOption(APIConfiguration.LOCALIZE_OPTION_TRADITIONAL_CHINESE);
        }
    
    return super.onOptionsItemSelected(item);
}