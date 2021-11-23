public synchronized double getDistance(boolean isNew) {
    isNew = newValue;
    newValue = false;
    return distance;
}