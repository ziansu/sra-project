@Test.Network.Test
public void hiveShouldHaveComplexityBetween2And3() {
    double complexity;
    Main.Containers.Boardgame game = games.get(20);
    complexity = game.getComplexity();
    assertTrue(((complexity > 2.0) && (complexity < 3.0)));
}