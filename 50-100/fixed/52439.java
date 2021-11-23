@org.junit.Test
public void testTennisGame_EahcPlayerWin4Points_Score_Deuce() throws TennisGameException {
    game.player1Scored();
    game.player1Scored();
    game.player1Scored();
    game.player2Scored();
    game.player2Scored();
    game.player2Scored();
    game.player1Scored();
    game.player2Scored();
    score = game.getScore();
    assertEquals("Tie score incorrect", "deuce", score);
}