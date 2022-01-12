private void setTv(com.connectsdk.device.ConnectableDevice tv) {
    if (tv == null) {
        stopTvApplication();
    }else {
        mTV = tv;
        mMediaPlayer = mTV.getCapability(com.connectsdk.service.capability.MediaPlayer.class);
        mMediaControl = mTV.getCapability(com.connectsdk.service.capability.MediaControl.class);
        mVolumeControl = mTV.getCapability(com.connectsdk.service.capability.VolumeControl.class);
    }
}