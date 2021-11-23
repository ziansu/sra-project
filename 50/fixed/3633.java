@java.lang.Override
public void setDuration(long duration) {
    this.duration = duration;
    if ((scrubbing) && (duration == (com.google.android.exoplayer2.C.TIME_UNSET))) {
        stopScrubbing(true);
    }else {
        updateScrubberState();
    }
    update();
}