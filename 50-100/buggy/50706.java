@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    listDialog.dismiss();
    mAutoplayCheckbox.setChecked(false);
    mShouldAutoPlayMedia = false;
    mCurrentVideoUrl = videoUrls.get(videoList.get(arg2));
    if (mFlintVideoManager.isMediaConnected()) {
        mVideoResolutionTextView.setText(videoList.get(arg2));
        mFlintVideoManager.playVideo(videoUrls.get(videoList.get(arg2)), getCurrentVideoTitle());
    }
}