@org.junit.Test
public void testFishing() {
    cisc275.game.model.Water h = new cisc275.game.model.Water(null, 10, 0, null);
    int result = (h.getHealth()) * (test.ManNum(game));
    assertEquals(result, test.Fishing(h));
}