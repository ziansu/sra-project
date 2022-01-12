public boolean isUnder(Segment1 other) {
    if (_poLeft.isUnder(other.getPoLeft())) {
        return true;
    }else {
        return false;
    }
}