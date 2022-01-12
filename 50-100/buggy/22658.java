@jUnit.Test
public void moveEntityEast() {
    jUnit.GameClass.move(Direction.EAST, entityTile);
    assertEquals("Entity's new position is correct", new jUnit.Coord3D(4, 4, 0), entityTile.getCoords());
    assertEquals("Entity's x position has been changed", 4, entityTile.getX());
    assertEquals("Entity's y position has been changed", 4, entityTile.getY());
    assertEquals("Entity's z position has been changed", 0, entityTile.getZ());
}