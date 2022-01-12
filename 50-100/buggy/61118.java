public java.lang.String[] isLoggedIn() {
    com.facebook.AccessToken accessToken = com.facebook.AccessToken.getCurrentAccessToken();
    java.lang.String id = "";
    java.lang.String token = "";
    if ((accessToken != null) && (!(accessToken.isExpired()))) {
        id = accessToken.getUserId();
        token = accessToken.getToken();
    }else {
        id = null;
        token = null;
    }
    return new java.lang.String[]{ id , token };
}