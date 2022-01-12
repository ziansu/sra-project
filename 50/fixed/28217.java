public boolean isLeft(Segment2 other) {
    if (_poCenter.isLeft(other._poCenter)) {
        return true;
    }else {
        return false;
    }
}