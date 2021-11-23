public static boolean isLoggedIn() {
    if (!(com.facebook.AccessToken.getCurrentAccessToken().getToken().isEmpty()))
        return true;
    
    return false;
}