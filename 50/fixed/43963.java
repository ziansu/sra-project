@java.lang.Override
public void pause() throws java.lang.IllegalStateException {
    super.pause();
    if ((mediaControllerView) != null) {
        mediaControllerView.updatePlayButton(true, false);
    }
}