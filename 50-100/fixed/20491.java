@jUnit.Test
public void createEntity() {
    assertEquals("Entity has a name", "Test Entity", entity.getName());
    assertEquals("Entity's location has been set correctly", room1, entityTile.getLocation());
    assertEquals("Entity's position has been set correctly", new jUnit.Coord3D(3, 4, 0), entityTile.getCoords());
    assertEquals("Entity's x position has been initialised", 3, entityTile.getX());
    assertEquals("Entity's y position has been initialised", 4, entityTile.getY());
}