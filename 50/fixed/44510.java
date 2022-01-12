@org.junit.Test
public void testTennisGame_Start() {
    score = game.getScore();
    assertEquals("Initial score incorrect", "love - love", score);
}