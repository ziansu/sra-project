public void setOauthToken(java.lang.String token) {
    oauthToken = token;
    if ((((oauthToken) != null) && (!(oauthToken.isEmpty()))) && (!(oauthToken.equals("null")))) {
        oauthStatus = com.singlemalt.googleplay.auth.googleplayauth.AuthService.Status.Success;
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new com.singlemalt.googleplay.auth.googleplayauth.AuthService.ServerAuthRunner());
    }else {
        oauthStatus = com.singlemalt.googleplay.auth.googleplayauth.AuthService.Status.Failure;
    }
    checkStatus();
}