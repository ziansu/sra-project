public void RetrieveSesionData() {
    android.content.SharedPreferences Preferences = getApplicationContext().getSharedPreferences(GenConf.SAVEDSESION, 0);
    java.lang.String account = Preferences.getString(GenConf.ACCOUNT, null);
    java.lang.String apikey = Preferences.getString(GenConf.APIKEY, null);
    if ((account != null) && (apikey != null)) {
        GetUserData(account, apikey);
    }else {
        GenConf.OpenedToSeeMessages = false;
        StartLoginActivity();
    }
}