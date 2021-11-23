@java.lang.Override
protected void onResume() {
    super.onResume();
    com.zqlite.android.logly.Logly.d(me.hejmo.cameratest.media.MediaActivity.TAG, "onResume");
    openCamera(me.hejmo.cameratest.media.VIDEO_WIDTH, me.hejmo.cameratest.media.VIDEO_HEIGHT, me.hejmo.cameratest.media.DESIRED_PREVIEW_FPS);
}