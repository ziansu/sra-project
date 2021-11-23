public boolean isLeft(Segment2 other) {
    if ((other._poCenter.getX()) > (_poCenter.getX())) {
        return true;
    }else {
        return false;
    }
}