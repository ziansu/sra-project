public android.location.Location goToNextWaypoint() {
    previous = current;
    current = pointQueue.remove();
    return current;
}