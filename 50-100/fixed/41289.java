private java.lang.String getToken() {
    final java.lang.String scope = "audience:server:client_id:785844054287-7hge652kf27md81acog9vg1u0nk9so83.apps.googleusercontent.com";
    try {
        java.lang.String email = getGoogleEmailAdress();
        if (email != null) {
            return com.google.android.gms.auth.GoogleAuthUtil.getToken(getActivity(), email, scope);
        }
    } catch (java.io.IOException e) {
        android.util.Log.d(LOG_TAG, "Error");
    } catch (com.google.android.gms.auth.UserRecoverableAuthException e) {
        android.util.Log.d(LOG_TAG, "Error");
    } catch (com.google.android.gms.auth.GoogleAuthException e) {
        android.util.Log.d(LOG_TAG, "Error");
    }
    return null;
}