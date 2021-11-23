@org.junit.Test
public void testConstructor() {
    java.lang.String deviceId = "of:123456";
    org.onosproject.net.flowext.FlowRuleExtEntry entry = new org.onosproject.net.flowext.FlowRuleExtEntry(org.onosproject.net.DeviceId.deviceId(deviceId), deviceId.getBytes());
    assertArrayEquals(deviceId.getBytes(), entry.getFlowEntryExt());
    assertEquals(deviceId, entry.getDeviceId().toString());
    assertEquals(deviceId.getBytes().length, entry.getLength());
}