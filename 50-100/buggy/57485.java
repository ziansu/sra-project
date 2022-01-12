public void testSetGetValueIsAdjusting() {
    assertFalse(brm.getValueIsAdjusting());
    brm.setValueIsAdjusting(false);
    assertEquals("", fireOrder);
    brm.setValueIsAdjusting(true);
    assertTrue(brm.getValueIsAdjusting());
    assertEquals("initial", fireOrder);
    assertEquals(listener.event, brm.changeEvent);
    assertEquals(brm, brm.changeEvent.getSource());
}