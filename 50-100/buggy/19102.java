private void loadUserData() {
    key = "get_user";
    int userId = com.hillelevo.cityelf.data.UserLocalStore.loadIntFromSharedPrefs(getApplicationContext(), Prefs.USER_ID);
    try {
        new com.hillelevo.cityelf.webutils.JsonMessageTask(this).execute(((com.hillelevo.cityelf.Constants.WebUrls.GET_USERDATA_URL) + (java.net.URLEncoder.encode(java.lang.String.valueOf(userId), "UTF-8"))), Constants.GET, com.hillelevo.cityelf.data.UserLocalStore.loadStringFromSharedPrefs(getApplicationContext(), Prefs.AUTH_CERTIFICATE));
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
}