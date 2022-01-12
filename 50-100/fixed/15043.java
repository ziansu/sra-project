public boolean isInFastArea(int x, int y) {
    if (((((leftupx) <= x) && (x <= (rightdownx))) && ((leftupy) <= y)) && (y <= (rightdowny))) {
        return true;
    }else {
        return false;
    }
}