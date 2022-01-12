private boolean isChanged(int id, int newVal) {
    return (changeTracker.get(id).intValue()) != newVal;
}