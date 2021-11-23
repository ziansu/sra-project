public static int getTVRemoteCode() {
    java.lang.String string = bei.m3c.helpers.PreferencesHelper.getSharedPreferences().getString(bei.m3c.helpers.PreferencesHelper.KEY_TV_REMOTE_CODE, java.lang.Integer.toString(bei.m3c.helpers.PreferencesHelper.DEFAULT_TV_CODE));
    return java.lang.Integer.parseInt(string);
}