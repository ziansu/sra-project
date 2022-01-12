@java.lang.Override
public void onPlay() {
    super.onPlay();
    handlePlayRequest(queueManager.current());
}