@java.lang.Override
public void start() throws java.lang.IllegalStateException {
    super.start();
    if ((mediaControllerView) != null) {
        mediaControllerView.updatePlayButton(false, false);
    }
}