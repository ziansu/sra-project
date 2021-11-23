public void getAuthToken(@android.support.annotation.NonNull
com.platypii.baseline.util.Callback<java.lang.String> callback) {
    if ((account) != null) {
        final java.lang.String token = account.getIdToken();
        if (token != null) {
            android.util.Log.i(com.platypii.baseline.BaseActivity.TAG, ("Got auth token " + token));
            callback.apply(token);
        }else {
            callback.error("Failed to get auth token");
        }
    }else {
        callback.error("Not signed in");
    }
}