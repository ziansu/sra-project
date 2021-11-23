public static void save(java.util.ArrayList<java.lang.String> drafts) {
    android.content.SharedPreferences.Editor e = Authentication.authentication.edit();
    e.putString(SettingValues.PREF_DRAFTS, me.ccrama.redditslide.Reddit.arrayToString(drafts, "</newdraft>"));
    e.commit();
}