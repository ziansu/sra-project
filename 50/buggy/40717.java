@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar refocusSeekBar) {
    mHandler.removeMessages(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.MSG_HIDE_DOF_VIEW);
    mDofView.setText(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.DOFDATA[((mDepth) / 2)]);
    mDofView.setVisibility(View.VISIBLE);
}