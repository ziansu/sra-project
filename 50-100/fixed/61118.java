public java.lang.String[] isLoggedIn() {
    com.facebook.AccessToken accessToken = com.facebook.AccessToken.getCurrentAccessToken();
    java.lang.String id = "";
    java.lang.String token = "";
    if ((accessToken != null) && (!(accessToken.isExpired()))) {
        id = accessToken.getUserId();
        token = accessToken.getToken();
        return new java.lang.String[]{ id , token };
    }else {
        return null;
    }
}