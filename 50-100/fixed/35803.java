protected void onPause() {
    super.onPause();
    bOnPaused = true;
    anychat.UserCameraControl(userID, 0);
    anychat.UserSpeakControl(userID, 0);
    anychat.UserCameraControl((-1), 0);
    anychat.UserSpeakControl((-1), 0);
}