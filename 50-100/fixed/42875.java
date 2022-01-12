@java.lang.Override
public void hmovement() {
    if (((movementSpeed) > 0) && ((getX()) >= 600)) {
        updateLogic(true);
    }
    if (((movementSpeed) < 0) && ((getX()) <= 2)) {
        updateLogic(true);
    }
    setX(((getX()) + (movementSpeed)));
}