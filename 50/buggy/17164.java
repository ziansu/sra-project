@java.lang.Override
public void exitScope() {
    java.lang.System.out.println("exitScope");
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.elementAt(((fCurrentEvent)++));
    assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_EXIT);
}