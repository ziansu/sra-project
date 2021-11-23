@java.lang.Override
protected void onEvent(org.apache.stratos.messaging.event.Event event) {
    org.apache.stratos.cartridge.agent.test.JavaCartridgeAgentTest.log.info("Instance started event received");
    instanceStarted = true;
}