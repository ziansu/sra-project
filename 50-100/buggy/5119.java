void seekToRelative(float progress) {
    long duration = mediaPlayer.getDuration();
    if (duration == (com.google.android.exoplayer2.C.TIME_UNSET)) {
        resumeProgress = progress;
        return ;
    }
    resumeProgress = -1;
    long position = ((long) (duration * progress));
    mediaPlayer.seekTo(position);
}