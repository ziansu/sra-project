@java.lang.Override
public void endOfPlay() {
    int trackIndex = getCurrentTrackPosition();
    if ((trackIndex + 1) < (this.queue.size())) {
        next();
    }
}