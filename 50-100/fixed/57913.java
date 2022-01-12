public void testSuit() {
    assertTrue(s.getValue().equals("Hearts"));
    assertTrue(s.getAbbrv().equals("H"));
    assertTrue(s.toString().equals(s.getAbbrv()));
}