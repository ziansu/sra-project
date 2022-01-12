@java.lang.Override
public double[] getCollisionPosition(asteroids.model.Ship ship1, asteroids.model.Ship ship2) throws asteroids.util.ModelException {
    try {
        asteroids.model.Point collision = ship1.getCollisionPosition(ship2);
        double[] result = new double[]{ collision.getXCoordinate() , collision.getYCoordinate() };
        return result;
    } catch (java.lang.Exception e) {
        throw new asteroids.util.ModelException(e);
    }
}