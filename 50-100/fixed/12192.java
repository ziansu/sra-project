private void setProfileLowQuality(com.example.vasskob.mycamera.utils.PictureSize videoSize, boolean isAudioOn) {
    android.media.CamcorderProfile profile = android.media.CamcorderProfile.get(CamcorderProfile.QUALITY_480P);
    if (isAudioOn) {
        setAudioParams(profile);
    }
    setVideoRateParams(profile, 1);
    mMediaRecorder.setVideoSize(videoSize.width(), videoSize.height());
}