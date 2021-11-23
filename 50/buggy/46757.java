public boolean isPointInterval() {
    if ((!(mLower.isInfinity())) && ((mLower.compareTo(mUpper)) == 0)) {
        return true;
    }
    return false;
}