private void exploreFeasiblePath() {
    travelTime += getPathFromPrevToCurr().getTravelTime();
    previousDestination = destination;
    if (!(pathQueue.isEmpty())) {
        destination = pathQueue.poll();
    }
}