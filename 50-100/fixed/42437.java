@org.junit.Test
public void testAddShips() throws org.cosmicencounter.exceptions.InvalidMoveException {
    int startShips = 1;
    int addedShips = 1;
    org.cosmicencounter.game.Planet planet = new org.cosmicencounter.game.Planet(_planetOwner, ((_planetOwner.getPlayerColor()) + "1"), startShips);
    planet.addShips(_planetOwner, addedShips);
    org.junit.Assert.assertEquals((startShips + addedShips), planet.numberOfShips(_planetOwner));
}