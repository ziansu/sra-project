@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.setting_changeCN)) {
        ai.olami.android.example.Config.setLocalizeOption(APIConfiguration.LOCALIZE_OPTION_SIMPLIFIED_CHINESE);
        switchLanguage(this, "china");
    }else
        if (id == (R.id.setting_changeTW)) {
            ai.olami.android.example.Config.setLocalizeOption(APIConfiguration.LOCALIZE_OPTION_TRADITIONAL_CHINESE);
            switchLanguage(this, "taiwan");
        }
    
    return super.onOptionsItemSelected(item);
}