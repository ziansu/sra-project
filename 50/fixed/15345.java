public int getStartingItemToEndlessBothDirectScrolling() {
    if ((getCollectionCount()) == 0) {
        return 0;
    }
    return (getCollectionCount()) * (((java.lang.Integer.MAX_VALUE) / (getCollectionCount())) / 2);
}