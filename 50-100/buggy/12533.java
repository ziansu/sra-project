public void hmovement() {
    if (((movementSpeed) > 0) && ((xpos) >= 630)) {
        updateLogic();
    }
    if (((movementSpeed) < 0) && ((xpos) <= 2)) {
        updateLogic();
    }
    xpos += movementSpeed;
}