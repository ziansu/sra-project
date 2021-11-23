public int getHighSpeedVideoEncoderBitRate(android.media.CamcorderProfile profile, int targetRate) {
    int bitRate;
    java.lang.String key = ((((profile.videoFrameWidth) + "x") + (profile.videoFrameHeight)) + ":") + targetRate;
    if (CameraSettings.VIDEO_ENCODER_BITRATE.containsKey(key)) {
        bitRate = CameraSettings.VIDEO_ENCODER_BITRATE.get(key);
    }else {
        android.util.Log.i(com.android.camera.SettingsManager.TAG, ("No pre-defined bitrate for " + key));
        bitRate = (profile.videoBitRate) * (targetRate / (profile.videoFrameRate));
    }
    return bitRate;
}