public void onClick(android.view.View arg0) {
    if (kioskMode) {
        startIntent(org.fourdnest.androidclient.ui.NewEggActivity.CAMERA_VIDEO_REQUEST);
    }
    showDialog(org.fourdnest.androidclient.ui.NewEggActivity.DIALOG_ASK_VIDEO);
}