@org.junit.Test
public void shouldBeListWithAllTheSameObjects() {
    game.setInitialState(params);
    game.evolve();
    game.evolve();
    java.util.List<com.capgemini.thegameoflife.Cell> cells = game.getAliveCell();
    org.junit.Assert.assertEquals(cells.containsAll(expected), expected.containsAll(cells));
}