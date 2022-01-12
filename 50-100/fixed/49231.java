@nl.bos.games.rummikub.tests.Test
public void testBagInitialization() {
    java.util.List<nl.bos.games.rummikub.tests.IStone> stones = nl.bos.games.rummikub.tests.TestRummikub.game.getBag().getStones();
    nl.bos.games.rummikub.tests.IBag testBag = new nl.bos.games.rummikub.tests.Bag(nl.bos.games.rummikub.tests.TestRummikub.SIZE);
    testBag.addStones();
    testBag.scramble();
    java.util.List<nl.bos.games.rummikub.tests.IStone> testStones = testBag.getStones();
    assertEquals(testStones.size(), stones.size());
    assertEquals(nl.bos.games.rummikub.tests.TestRummikub.SIZE, stones.size());
    assertEquals(nl.bos.games.rummikub.tests.TestRummikub.SIZE, testStones.size());
}