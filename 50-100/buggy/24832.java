@java.lang.Override
protected void onPostExecute(java.lang.Boolean isNewUser) {
    if (isNewUser) {
        bundleFacebookData(com.facebook.AccessToken.getCurrentAccessToken());
        showNewNicknameDialog();
    }else {
        com.peprally.jeremy.peprally.utils.UserProfileParcel userProfileParcel = new com.peprally.jeremy.peprally.utils.UserProfileParcel(com.peprally.jeremy.peprally.utils.ActivityEnum.HOME, userProfile, playerProfile);
        finish();
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.peprally.jeremy.peprally.activities.HomeActivity.class);
        intent.putExtra("USER_PROFILE_PARCEL", userProfileParcel);
        startActivity(intent);
        overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
    }
}