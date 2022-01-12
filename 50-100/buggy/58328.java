public se.sensorship.Direction nextDirection() {
    int currentIndexOnPath = getClosestPointOnPathIndex();
    int directionPointIndex = 0;
    for (; directionPointIndex < (turnDirectionOnPathIndex.size()); directionPointIndex++) {
        if ((turnDirectionOnPathIndex.get(directionPointIndex)) > currentIndexOnPath) {
            break;
        }
    }
    return directions[directionPointIndex];
}