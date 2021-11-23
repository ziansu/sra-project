@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    java.lang.String plainToken = java.lang.String.format("%s:%s", mModel.username, mModel.password);
    java.lang.String encodedToken = android.util.Base64.encodeToString(plainToken.getBytes(), Base64.DEFAULT);
    com.auction.auction.data.services.IAuthenticationRemoteService authenticationRemoteService = new com.auction.auction.data.services.AuthenticationRemoteService();
    if (authenticationRemoteService.isLoginSuccessful(mModel, encodedToken)) {
        saveBasicAuthTokenToSharedPref(encodedToken);
        return true;
    }else
        if (authenticationRemoteService.isRegistrationSuccessful(mModel)) {
            saveBasicAuthTokenToSharedPref(encodedToken);
            return true;
        }else {
            return false;
        }
    
}