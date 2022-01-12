@org.junit.Test
public void knowsWhenGameIsWon() {
    loop.setPlayerMove(0);
    loop.playMove();
    loop.setPlayerMove(3);
    loop.playMove();
    loop.setPlayerMove(1);
    loop.playMove();
    loop.setPlayerMove(4);
    loop.playMove();
    loop.setPlayerMove(2);
    org.junit.Assert.assertTrue(loop.isFinished());
    org.junit.Assert.assertEquals("X wins!", loop.getStatus());
}