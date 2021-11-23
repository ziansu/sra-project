@tests.Test
public void testCheckPlayer() throws java.lang.Exception {
    int[][] gameField = new int[][]{ new int[]{ 0 , 0 , 2 } , new int[]{ 0 , 2 , 0 } , new int[]{ 2 , 0 , 0 } };
    int player = 2;
    final boolean relult = tests.CheckWinTest.checkWin.checkPlayer(gameField, player);
    assertEquals(true, relult);
}