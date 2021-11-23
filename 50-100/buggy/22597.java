@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    com.petrodevelopment.copdapp.util.U.log(this, ((("From user: " + fromUser) + ", progress: ") + progress));
    long progressInMillis = ((mTrackDuration) / 100) * progress;
    com.petrodevelopment.copdapp.util.U.log(this, ((("From user: " + fromUser) + ", progressInMillis: ") + progressInMillis));
    long progressInMillisRounded = com.petrodevelopment.copdapp.util.U.roundToSeconds(progressInMillis);
    updateTimer(progressInMillisRounded);
    updatePlayer(((int) (progressInMillisRounded)));
}