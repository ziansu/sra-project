public void checkLoginStatus() {
    com.firebase.client.AuthData authData = mFirebaseRef.getAuth();
    if ((authData != null) && (authData.getUid().equals(mSharedPreferences.getString(Constants.KEY_UID, null)))) {
        android.content.Intent intent = new android.content.Intent(this, com.epicodus.myrestaurants.ui.MainActivity.class);
        intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(intent);
        finish();
    }
}