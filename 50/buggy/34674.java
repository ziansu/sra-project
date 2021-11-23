private void setScaleType(com.malmstein.fenster.view.FensterVideoView.ScaleType scaleType) {
    switch (scaleType) {
        case SCALE_TO_FIT :
            mMediaPlayer.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT);
            break;
        case CROP :
            mMediaPlayer.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
            break;
    }
}