private void update(int index) {
    int delta = (receivedIndex) - index;
    if (delta > 0) {
        replayWindow = (replayWindow) << delta;
        replayWindow |= 1;
    }else {
        replayWindow |= 1 << delta;
    }
    receivedIndex = index;
}