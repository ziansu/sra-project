public boolean run() {
    if (align.isGrabberEmpty()) {
        align.grabTote();
    }
    if (align.isCurrentlyAligning()) {
        return false;
    }else {
        desiredWinchHeight = 1;
    }
    return true;
}