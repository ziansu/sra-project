@org.junit.Test
public void testGetAndAddPossibleState() {
    model.MarkovChain mc = new model.MarkovChain("foo");
    assertEquals(mc.getPossibleState(), "");
    mc.addState("bar");
    assertEquals(mc.getPossibleState(), "bar");
    mc.addState("foobar");
    java.lang.String result = mc.getPossibleState();
    assertTrue(((result == "bar") || (result == "foobar")));
}