private void exploreFeasiblePath() {
    travelTime += getPathFromPrevToCurr().getTravelTime();
    previousDestination = destination;
    destination = pathQueue.poll();
}