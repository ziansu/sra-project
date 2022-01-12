public void testSuit() {
    assertTrue(((s.getValue()) == "Hearts"));
    assertTrue(((s.getAbbrv()) == "H"));
    assertTrue(((s.toString()) == (s.getAbbrv())));
}