@org.junit.Test
public void testConstructor() {
    final long time = java.lang.System.currentTimeMillis();
    final org.onosproject.net.flowext.FlowRuleExtEntry flowRule = new org.onosproject.net.flowext.FlowRuleExtEntry(org.onosproject.net.DeviceId.deviceId("of:123456"), null, "of:123456".getBytes());
    final org.onosproject.net.flowext.FlowRuleExtEvent event = new org.onosproject.net.flowext.FlowRuleExtEvent(FlowRuleExtEvent.Type.RULE_UPDATED, flowRule);
    validateEvent(event, FlowRuleExtEvent.Type.RULE_UPDATED, flowRule, time, (time + (java.util.concurrent.TimeUnit.SECONDS.toMillis(30))));
}