public android.location.Location goToNextWaypoint() {
    if (pointQueue.isEmpty()) {
        current = null;
    }else {
        previous = current;
        current = pointQueue.remove();
    }
    return current;
}