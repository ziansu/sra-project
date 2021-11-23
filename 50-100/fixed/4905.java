public void updateLocation(java.util.ArrayList<Edge> possibleMoves) {
    if (((currentSpeed) + (acceleration)) <= (maxVelocity)) {
        currentSpeed += acceleration;
    }else {
        currentSpeed = maxVelocity;
    }
    if (((distanceToNextDestination) - (currentSpeed)) > 0) {
        distanceToNextDestination -= currentSpeed;
        distanceTraveled += currentSpeed;
    }else {
        distanceTraveled += distanceToNextDestination;
        currentSpeed = 0;
        chooseNewDestination(possibleMoves);
    }
}