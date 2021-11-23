public float getPlaybackSpeed() {
    float parsedSpeed = parsePlaybackSpeed();
    if (parsedSpeed == (org.bottiger.podcast.utils.PlaybackSpeed.UNDEFINED))
        return org.bottiger.podcast.utils.PlaybackSpeed.DEFAULT;
    
    return parsedSpeed;
}