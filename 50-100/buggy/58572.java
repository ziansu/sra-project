@java.lang.Override
public com.epam.torpedo.components.Coordinate nextShot() {
    com.epam.torpedo.components.Coordinate coordinate;
    if (targetPoints.isEmpty()) {
        do {
            int width = dimension.getWidth();
            int height = dimension.getHeight();
            coordinate = com.epam.torpedo.components.Coordinate.getRandomPosition(width, height);
        } while (isExists(coordinate) );
        setLastShot(coordinate);
    }else {
        coordinate = targetPoints.pop();
    }
    addShot(coordinate);
    return coordinate;
}