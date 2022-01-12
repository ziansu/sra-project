@GOL.Test
public void rule1_zeroNeighbours() {
    GOL.GameOfLife gameOfLife = new GOL.GameOfLife(3, 3);
    GOL.Coordinates coords = new GOL.Coordinates(1, 1);
    gameOfLife.set(coords, GameOfLife.ALIVE);
    assertEquals("Pre-condition failed.", GameOfLife.ALIVE, gameOfLife.get(coords));
    gameOfLife.step();
    assertEquals("Test failed.", GameOfLife.DEAD, gameOfLife.get(coords));
}