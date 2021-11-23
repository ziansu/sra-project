@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null)
        getSharedPreferences("PARSE_MODERATORS", hu.zokni1996.android_forum.Main.MODE_PRIVATE).edit().putBoolean("ParseModerators", true).commit();
    else {
        getSharedPreferences("PARSE_MODERATORS", hu.zokni1996.android_forum.Main.MODE_PRIVATE).edit().putBoolean("ParseModerators", false).commit();
    }
}