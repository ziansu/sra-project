@org.junit.Test
public void testPinsWereNotHittedInAllFrames() {
    src.main.java.Game game = new src.main.java.Game();
    for (int i = 0; i < 20; i++) {
        game.roll(0);
    }
    org.hamcrest.MatcherAssert.assertThat(0, org.hamcrest.CoreMatchers.is(game.score()));
}