private void removeObserverInternal() {
    (observerCount)--;
    if (((observerCount) == 0) && ((choreographer) != null)) {
        choreographer.removeFrameCallback(this);
        sampledVsyncTimeNs = 0;
    }
}