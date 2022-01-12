@org.junit.Test(timeout = 2000)
public void changeProtocol_OfNode1ToD1R1OnInstant3WhileSimulatingNetwork3ForDestination0_MessageCountIs16() throws java.lang.Exception {
    addons.eventhandlers.MessageAndDetectionCountHandler handler = new addons.eventhandlers.MessageAndDetectionCountHandler();
    handler.register(engine.getEventGenerator());
    addons.eventhandlers.DebugEventHandler debug = new addons.eventhandlers.DebugEventHandler(false);
    debug.setExportEnabled(true);
    debug.register(engine.getEventGenerator());
    simulate(3, 0, new protocols.D1R1Protocol(), 1, 3L);
    org.hamcrest.MatcherAssert.assertThat(handler.getMessageCount(), org.hamcrest.Matchers.is(14));
}