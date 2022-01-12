@org.junit.Test
public void testTimeConstructor() {
    final long time = 123L;
    final org.onosproject.net.flowext.FlowRuleExtEntry flowRule = new org.onosproject.net.flowext.FlowRuleExtEntry(org.onosproject.net.DeviceId.deviceId("of:123456"), "of:123456".getBytes());
    final org.onosproject.net.flowext.FlowRuleExtEvent event = new org.onosproject.net.flowext.FlowRuleExtEvent(FlowRuleExtEvent.Type.RULE_REMOVE_REQUESTED, flowRule, time);
    validateEvent(event, FlowRuleExtEvent.Type.RULE_REMOVE_REQUESTED, flowRule, time);
}