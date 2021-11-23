@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    timelogger.mprtcz.com.timelogger.activities.SettingsListActivity.Language language = languages[(position - 1)];
    loadChosenLanguage(language.getLocale());
    android.util.Log.d(timelogger.mprtcz.com.timelogger.activities.SettingsListActivity.TAG, ("language : " + (language.getLocale())));
    saveLanguage(language.getLocale().getCountry().toLowerCase());
    finish();
}