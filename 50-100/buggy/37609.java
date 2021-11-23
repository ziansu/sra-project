private void setProfile4KQuality(com.example.vasskob.mycamera.utils.PictureSize videoSize, boolean isAudioOn) {
    android.media.CamcorderProfile profile = android.media.CamcorderProfile.get(CamcorderProfile.QUALITY_1080P);
    setVideoRateParams(profile, com.example.vasskob.mycamera.screens.CameraActivity.FOR_K_MULTIPLIER);
    mMediaRecorder.setVideoSize(videoSize.width(), videoSize.height());
    if (isAudioOn) {
        setAudioParams(profile);
    }
}