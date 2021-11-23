@java.lang.Override
public void terminateShip(asteroids.model.Ship ship) throws asteroids.util.ModelException {
    try {
        ship.terminate();
    } catch (java.lang.NullPointerException e) {
        throw new asteroids.util.ModelException(e.getMessage());
    }
}