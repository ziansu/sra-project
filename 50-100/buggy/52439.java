@org.junit.Test
public void testTennisGame_EahcPlayerWin4Points_Score_Deuce() throws TennisGameException {
    TennisGame game = new TennisGame();
    game.player1Scored();
    game.player1Scored();
    game.player1Scored();
    game.player2Scored();
    game.player2Scored();
    game.player2Scored();
    game.player1Scored();
    game.player2Scored();
    java.lang.String score = game.getScore();
    assertEquals("Tie score incorrect", "deuce", score);
}