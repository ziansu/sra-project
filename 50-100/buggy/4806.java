@org.junit.Test
public void testGetAndAddPossibleState() {
    model.MarkovChain mc = new model.MarkovChain("foo");
    assertEquals(mc.getPossibleState(), "");
    mc.addState("bar");
    assertEquals(mc.getPossibleState(), "bar");
    mc.addState("foobar");
    assertTrue((((mc.getPossibleState()) == "bar") || ((mc.getPossibleState()) == "foobar")));
}