@org.junit.Test
public void canReturnWinOrLoseScoreWhenTheAiItselfWins() throws java.lang.Exception {
    com.tictactoe.Board board = new com.tictactoe.Board();
    populateBoard_X_Wins(board);
    com.tictactoe.Rules rules = new com.tictactoe.RulesFor3x3();
    com.tictactoe.Minimax minimax = new com.tictactoe.Minimax(rules, board, "X", "O");
    int score = minimax.minimax(board, true);
    org.junit.Assert.assertEquals(10, score);
}