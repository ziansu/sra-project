@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar refocusSeekBar) {
    mHandler.removeMessages(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.MSG_HIDE_DOF_VIEW);
}