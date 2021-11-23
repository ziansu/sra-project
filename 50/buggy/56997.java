private boolean isChanged(int id, int newVal) {
    if ((changeTracker.get(id)) == null) {
        return true;
    }
    return (changeTracker.get(id)) != newVal;
}