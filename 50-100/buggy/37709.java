@java.lang.Override
public boolean onSelection(com.afollestad.materialdialogs.MaterialDialog dialog, android.view.View view, int which, java.lang.CharSequence text) {
    try {
        com.android.projectz.teamrocket.thebusapp.util.SharedPreferencesUtils.setSelectedTheme(this, ((java.lang.String) (text)));
        displaySettingList();
        changeTheme(which);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        com.android.projectz.teamrocket.thebusapp.util.SharedPreferencesUtils.setSelectedLanguage(this, "Light");
        displaySettingList();
    }
    return true;
}