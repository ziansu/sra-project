private void playFromPosition(int position) {
    int usablePosition = position - 1;
    if ((usablePosition >= 0) && (usablePosition < (titleQueue2.size()))) {
        playTitle(titleQueue2.get(usablePosition));
    }else {
        stopPlayback();
    }
}