void seekToRelative(float progress) {
    resumeProgress = -1;
    if (progress == 0.0F) {
        mediaPlayer.seekTo(0);
        return ;
    }
    long duration = mediaPlayer.getDuration();
    if (duration == (com.google.android.exoplayer2.C.TIME_UNSET)) {
        resumeProgress = progress;
        return ;
    }
    long position = ((long) (duration * progress));
    mediaPlayer.seekTo(position);
}