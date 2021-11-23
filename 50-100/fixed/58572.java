@java.lang.Override
public com.epam.torpedo.components.Coordinate nextShot() {
    com.epam.torpedo.components.Coordinate coordinate;
    do {
        if (targetPoints.isEmpty()) {
            int width = dimension.getWidth();
            int height = dimension.getHeight();
            coordinate = com.epam.torpedo.components.Coordinate.getRandomPosition(width, height);
        }else {
            coordinate = targetPoints.pop();
        }
    } while (isExists(coordinate) );
    setLastShot(coordinate);
    addShot(coordinate);
    return coordinate;
}