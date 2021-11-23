public static int getTVRemoteCode() {
    return bei.m3c.helpers.PreferencesHelper.getSharedPreferences().getInt(bei.m3c.helpers.PreferencesHelper.KEY_TV_REMOTE_CODE, bei.m3c.helpers.PreferencesHelper.DEFAULT_TV_CODE);
}