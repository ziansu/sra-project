@org.junit.Test
public void testSetScore() {
    test.setScore(50);
    assertEquals("Score: 50", test.getScoreLabel().getText());
    test.setScore(100);
    assertEquals("Score: 100", test.getScoreLabel().getText());
}