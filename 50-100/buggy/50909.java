private boolean isValid(int X, int Y) {
    if ((((X >= 0) || (X <= 7)) || (Y >= 0)) || (Y <= 7)) {
        return true;
    }
    return false;
}