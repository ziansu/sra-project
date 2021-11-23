@asteroids.model.Raw
public boolean isValidRadius(double radius) {
    return radius > (asteroids.model.Ship.getRadiusLimit());
}