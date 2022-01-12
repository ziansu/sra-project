@GOL.Test
public void rule1_oneNeighbour() {
    GOL.GameOfLife gameOfLife = new GOL.GameOfLife();
    GOL.Coordinates coords = new GOL.Coordinates(1, 1);
    gameOfLife.set(coords, GameOfLife.ALIVE);
    gameOfLife.set(coords.getX(), ((coords.getY()) + 1), GameOfLife.ALIVE);
    assertEquals("Pre-condition failed.", GameOfLife.ALIVE, gameOfLife.get(coords));
    gameOfLife.step();
    assertEquals("Test failed.", GameOfLife.DEAD, gameOfLife.get(coords));
}