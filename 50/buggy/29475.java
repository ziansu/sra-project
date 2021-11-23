public int run() {
    if (align.isGrabberEmpty()) {
        align.grabTote();
    }
    if (align.isCurrentlyAligning()) {
        return 0;
    }else {
        desiredWinchHeight = 1;
    }
    return 1;
}