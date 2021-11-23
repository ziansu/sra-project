public static java.lang.String retrieveAuthToken(android.content.Context context) {
    com.reminisense.fa.models.LoginResult loginResult = com.reminisense.fa.managers.CacheManager.retrieveLoginResult(context);
    return loginResult.getAuthenticationToken();
}