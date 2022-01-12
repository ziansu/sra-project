@java.lang.Override
public void intercept(com.snaptech.emissiodemo2.WebService.Common.RequestFacade request) {
    android.content.SharedPreferences sharedpreferences = com.snaptech.emissiodemo2.custom.App.getAppContext().getSharedPreferences(Constants.LOGIN_PREFS_NAME, Context.MODE_PRIVATE);
    java.lang.String accessToken = sharedpreferences.getString(Constants.LOGIN_ACCESS_TOKEN_PREFS_KEY, null);
    if (!(url.equalsIgnoreCase(Constants.FORCED_UPDATE_URL)))
        request.addHeader("Authorization", "");
    else {
        java.lang.String accessToken2 = sharedpreferences.getString(Constants.LOGIN_ACCESS_TOKEN_PREFS_KEY, null);
        request.addHeader("Authorization", accessToken2);
    }
}