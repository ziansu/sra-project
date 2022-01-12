@java.lang.Override
public boolean shipWithinBoard(battleships.model.Ship ship, int x, int y) {
    return (((x >= 0) && (x < ((getWidth()) - (ship.getMaxSquare().getX())))) && (y >= 0)) && (y < ((getHeight()) - (ship.getMaxSquare().getY())));
}