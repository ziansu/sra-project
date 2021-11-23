@java.lang.Override
public void run() {
    int id = (mMetronome.isRunning()) ? R.drawable.ic_media_play : R.drawable.ic_media_pause;
    changeFloatingButtonIcon(id);
}