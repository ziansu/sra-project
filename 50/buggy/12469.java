@java.lang.Override
protected void onCurrentAccessTokenChanged(com.facebook.AccessToken oldAccessToken, com.facebook.AccessToken newAccessToken) {
    if (oldAccessToken == null) {
        handleLoginResult(newAccessToken);
    }else
        if (newAccessToken == null) {
            com.kosbrother.mongmongwoo.Settings.clearAllUserData();
            listener.onFbLogout();
        }
    
}