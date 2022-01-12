@org.junit.Test
public void testStrikeMovesToNextFrame() {
    testScoreSheet = new lab2.ScoreSheet();
    testScoreSheet.throwBall(10);
    assertEquals(10, testScoreSheet.getFrameScore(1));
    assertEquals(10, testScoreSheet.getGameScore());
    assertEquals(2, testScoreSheet.getFrame());
}