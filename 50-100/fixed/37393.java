public void testFireStateChanged() {
    javax.swing.DefaultBoundedRangeModel2Test.SimpleChangeListener listener1 = new javax.swing.DefaultBoundedRangeModel2Test.SimpleChangeListener("1");
    javax.swing.DefaultBoundedRangeModel2Test.SimpleChangeListener listener2 = new javax.swing.DefaultBoundedRangeModel2Test.SimpleChangeListener("2");
    javax.swing.DefaultBoundedRangeModel2Test.SimpleChangeListener listener3 = new javax.swing.DefaultBoundedRangeModel2Test.SimpleChangeListener("3");
    brm.addChangeListener(listener1);
    brm.addChangeListener(listener2);
    brm.addChangeListener(listener3);
    brm.setValue(7);
    assertEquals("321initial", fireOrder);
}