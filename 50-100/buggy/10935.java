@java.lang.Override
public void onClick(android.view.View v) {
    if (video.isPlaying()) {
        switchPlayOrPausButtonState(video.isPlaying());
        video.pause();
    }else {
        switchPlayOrPausButtonState(video.isPlaying());
        video.resume();
    }
}