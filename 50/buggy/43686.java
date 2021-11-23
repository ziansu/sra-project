private void addObserverInternal() {
    (observerCount)++;
    if ((observerCount) == 1) {
        choreographer.postFrameCallback(this);
    }
}