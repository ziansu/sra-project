public void arcLeft(float radius, float deg) {
    pilot.arc(radius, deg);
    while (pilot.isMoving()) {
    } 
}