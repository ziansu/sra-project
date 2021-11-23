private void processGates() {
    freeToRoam = true;
    for (logic.Gate someGate : gameState.getGateList()) {
        if (this.getRectangle().intersects(someGate.getRectangle())) {
            freeToRoam = false;
            intersectingGate = someGate;
        }
    }
    if (freeToRoam) {
        intersectingGate = null;
    }
}