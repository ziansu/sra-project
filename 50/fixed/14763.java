private void toggleMediaControlsVisiblity() {
    android.util.Log.i(TAG, "toggleMediaControlsVisibility");
    if (mMediaController.isShowing()) {
        mMediaController.hide();
    }else {
        mMediaController.show(0);
    }
}