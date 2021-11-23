public void setAccessToken(java.lang.String accessToken) {
    android.util.Log.i("token is", ("" + accessToken));
    googleAccessProtectedResource.setAccessToken(accessToken);
    no.niths.android.common.AppController.token = accessToken;
}