@org.junit.Test
public void testEquals() {
    java.lang.String deviceId = "of:123456";
    org.onosproject.net.flowext.FlowRuleExtEntry entry1 = new org.onosproject.net.flowext.FlowRuleExtEntry(org.onosproject.net.DeviceId.deviceId(deviceId), null, deviceId.getBytes());
    org.onosproject.net.flowext.FlowRuleExtEntry entry2 = new org.onosproject.net.flowext.FlowRuleExtEntry(org.onosproject.net.DeviceId.deviceId(deviceId), null, deviceId.getBytes());
    assertEquals(entry1, entry2);
}