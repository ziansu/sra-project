@java.lang.Override
public void run() {
    int id = (mMetronome.isRunning()) ? R.drawable.ic_media_pause : R.drawable.ic_media_play;
    changeFloatingButtonIcon(id);
}