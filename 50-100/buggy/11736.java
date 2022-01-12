@java.lang.Override
public void setTimescale(int order) {
    java.lang.System.out.println(("setTimescale " + order));
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.elementAt(((fCurrentEvent)++));
    assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_TIMESCALE);
    assertEquals(event.fTimestamp, ((long) (order)));
}