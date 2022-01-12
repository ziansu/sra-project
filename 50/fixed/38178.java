@java.lang.Override
public void start() {
    if ((sequencerThread) != null) {
        sequencerThread.startPlaying();
    }
}