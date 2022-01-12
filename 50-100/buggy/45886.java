public void checkLoginStatus() {
    com.firebase.client.AuthData authData = mFirebaseRef.getAuth();
    if (authData != null) {
        android.util.Log.v(com.epicodus.myrestaurants.ui.LoginActivity.TAG, authData.getUid());
        android.util.Log.v(com.epicodus.myrestaurants.ui.LoginActivity.TAG, mSharedPreferences.getString(Constants.KEY_UID, null));
        android.content.Intent intent = new android.content.Intent(this, com.epicodus.myrestaurants.ui.MainActivity.class);
        intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(intent);
        finish();
    }
}