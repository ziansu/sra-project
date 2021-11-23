public boolean isUnder(Segment1 other) {
    if ((other.getPoLeft().getY()) > (_poLeft.getY())) {
        return true;
    }else {
        return false;
    }
}