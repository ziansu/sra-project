@org.junit.Test
public void testSetScore() {
    test.setScore(50);
    org.junit.Assert.assertEquals("Score: 50", test.getScoreLabel().getText());
    test.setScore(100);
    org.junit.Assert.assertEquals("Score: 100", test.getScoreLabel().getText());
}