@org.junit.Test
public void placeEnemyShip() throws java.lang.Exception {
    currentShip = model.placeEnemyShip("battleship", 4);
    assertTrue(((currentShip) instanceof edu.oregonstate.cs361.battleship.Ship));
}