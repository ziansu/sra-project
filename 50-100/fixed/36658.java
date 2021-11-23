@org.junit.Test
public void testScoring() throws java.io.IOException {
    com.ragego.engine.GameBoard game = new com.ragego.utils.StandardGameFormatIO(com.ragego.utils.FileUtils.getResourceAsTMPFile(com.ragego.utils.StandardGameFormatIO.class, "2015-03-09-35.sgf"), board).read();
    game.getScoreCounter().compute();
    game.getScoreCounter().getScore(new com.ragego.engine.Komi(6.5), ScoreCounter.ScoringMethod.TERRITORY);
    java.lang.System.out.println(game.getScoreCounter().formatResult());
}