public void getAuthToken(final com.platypii.baseline.util.Callback<java.lang.String> callback) {
    if ((account) != null) {
        final java.lang.String token = account.getIdToken();
        if (token != null) {
            android.util.Log.i(com.platypii.baseline.BaseActivity.TAG, ("Got auth token " + token));
            if (callback != null) {
                callback.apply(token);
            }
        }else {
            if (callback != null) {
                callback.error("Failed to get auth token");
            }
        }
    }else {
        callback.error("Not signed in");
    }
}