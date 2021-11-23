private void stopRecordingVideo() {
    mIsRecordingVideo = false;
    mButtonVideo.setText(R.string.record);
    mMediaRecorder.stop();
    mMediaRecorder.reset();
    android.app.Activity activity = getActivity();
    if (null != activity) {
        mInformationTextView.setText(("Video saved: " + (mOutputFile.getAbsolutePath())));
    }
    mOutputFile = fileMaker.getTempFile();
    startPreview();
}