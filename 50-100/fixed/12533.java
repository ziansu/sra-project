public void hmovement() {
    if (((movementSpeed) > 0) && ((xpos) >= 630)) {
        updateLogic(true);
    }
    if (((movementSpeed) < 0) && ((xpos) <= 2)) {
        updateLogic(true);
    }
    xpos += movementSpeed;
}