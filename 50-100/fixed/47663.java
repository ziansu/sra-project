@org.junit.Test
public void givePointToOpponentWhenStoneIsCaptivated() throws java.lang.Exception {
    com.ragego.engine.GameBoard game = new com.ragego.utils.StandardGameFormatIO(com.ragego.utils.FileUtils.getResourceAsTMPFile(com.ragego.utils.StandardGameFormatIO.class, "2015-03-01-19.sgf"), board).read();
    game.getScoreCounter().compute();
    game.getScoreCounter().getScore(new com.ragego.engine.Komi(0.5), ScoreCounter.ScoringMethod.TERRITORY);
    com.ragego.utils.DebugUtils.printBoard(game);
    java.lang.System.out.println(game.getScoreCounter().formatResult());
}