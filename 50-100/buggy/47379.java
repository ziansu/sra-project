@org.junit.Test
public void testGamePlayMovesFromStart() {
    java.lang.String expectedState = "0|2|2|1|11|10|10|3|8|8|7|7|1|0|2";
    kalaha.makeMove(0).makeMove(1).makeMove(4).makeMove(2).makeMove(5);
    java.lang.System.out.println(kalaha.getBoardState());
    org.junit.Assert.assertEquals(expectedState, kalaha.getBoardState());
    org.junit.Assert.assertEquals(0, kalaha.getWinningPlayer().getIndex());
    org.junit.Assert.assertEquals(0, kalaha.getPlayerToMove().getIndex());
}