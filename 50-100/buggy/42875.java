@java.lang.Override
public void hmovement() {
    if (((movementSpeed) > 0) && ((getX()) >= 600)) {
        updateLogic();
    }
    if (((movementSpeed) < 0) && ((getX()) <= 2)) {
        updateLogic();
    }
    setX(((getX()) + (movementSpeed)));
}