public void onClick(android.content.DialogInterface dialog, int whichButton) {
    playerProfile.setHasUserProfile(true);
    playerProfile.setNickname(userProfile.getNickname());
    new com.peprally.jeremy.peprally.activities.LoginActivity.PushPlayerProfileChangesToDBTask().execute(playerProfile);
    com.peprally.jeremy.peprally.utils.UserProfileParcel userProfileParcel = new com.peprally.jeremy.peprally.utils.UserProfileParcel(com.peprally.jeremy.peprally.utils.ActivityEnum.HOME, userProfile, playerProfile);
    finish();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.peprally.jeremy.peprally.activities.HomeActivity.class);
    intent.putExtra("PLAYER_PROFILE_PARCEL", userProfileParcel);
    startActivity(intent);
    overridePendingTransition(R.anim.bottom_in, R.anim.top_out);
}