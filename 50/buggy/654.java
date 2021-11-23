protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        this.userProfile = rs.veselinromic.eref.wrapper.Wrapper.getUserProfile();
    } catch (java.io.IOException e) {
        android.util.Log.e("GetUserProfileTask", "e", e);
    }
    return null;
}