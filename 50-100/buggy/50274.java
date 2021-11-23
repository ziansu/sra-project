@java.lang.Override
public void onPause() {
    super.onPause();
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putBoolean(org.yegie.keenforandroid.MenuActivity.MENU_MULT, ((gameMult) != 0));
    editor.putInt(org.yegie.keenforandroid.MenuActivity.MENU_DIFF, gameDiff);
    editor.putInt(org.yegie.keenforandroid.MenuActivity.MENU_SIZE, ((gameSize) - 3));
    editor.apply();
}