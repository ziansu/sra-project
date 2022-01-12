private void playFromPosition(int position) {
    int usablePosition = position - 1;
    if ((usablePosition >= 0) && (usablePosition < (titleQueue.size()))) {
        playTitle(titleQueue2.get(usablePosition));
    }else {
        stopPlayback();
    }
}