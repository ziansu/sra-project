@org.junit.Test
public void testCreatePuzzle() {
    com.glroland.sudoku.game.PuzzleFactory pz = new com.glroland.sudoku.game.PuzzleFactory();
    com.glroland.sudoku.game.Puzzle puzzle = pz.createPuzzle();
    assertNotNull(puzzle);
}