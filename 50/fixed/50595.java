private boolean isAutoLogin() {
    return sharedPref.getBoolean(AppConstants.PREF_AUTOLOGIN, false);
}