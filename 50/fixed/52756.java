public boolean isAbove(Segment1 other) {
    if (_poLeft.isAbove(other.getPoLeft())) {
        return true;
    }else {
        return false;
    }
}