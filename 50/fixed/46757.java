public boolean isPointInterval() {
    return (!(mLower.isInfinity())) && ((mLower.compareTo(mUpper)) == 0);
}