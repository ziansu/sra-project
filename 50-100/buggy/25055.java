@org.junit.Test
public void testRemoveActiveSwitch() {
    net.floodlightcontroller.core.IOFSwitch sw = org.easymock.EasyMock.EasyMock.createNiceMock(net.floodlightcontroller.core.IOFSwitch.class);
    boolean exceptionThrown = false;
    expect(sw.getId()).andReturn(1L).anyTimes();
    replay(sw);
    getController().activeSwitches.put(sw.getId(), sw);
    try {
        getController().getSwitches().remove(1L);
    } catch (java.lang.UnsupportedOperationException e) {
        exceptionThrown = true;
    }
    assertTrue(exceptionThrown);
    verify(sw);
}