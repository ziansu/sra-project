public synchronized double getDistance(boolean isNew) {
    newValue = isNew;
    newValue = false;
    return distance;
}