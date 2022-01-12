@java.lang.Override
public void appendTransition(int id, long timestamp, BitVector values) {
    java.lang.System.out.println(((((("appendTransition " + id) + " ") + timestamp) + " ") + (values.toString(2))));
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.get(((fCurrentEvent)++));
    assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_TRANSITION);
    assertEquals(event.fTimestamp, timestamp);
    assertEquals(event.fValues.toString(2), values.toString(2));
}