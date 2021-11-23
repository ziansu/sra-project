public void setAccessToken(java.lang.String accessToken) {
    googleAccessProtectedResource.setAccessToken(accessToken);
    no.niths.android.common.AppController.token = accessToken;
}