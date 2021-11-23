@java.lang.Override
public int newNet(java.lang.String shortName, int cloneId, int width) {
    java.lang.System.out.println(((((("newNet " + shortName) + " ") + cloneId) + " ") + width));
    VCDLoaderTest.ExpectTraceBuilder.Event event = fEventList.get(((fCurrentEvent)++));
    assertEquals(event.fType, VCDLoaderTest.ExpectTraceBuilder.EXPECT_NET);
    assertEquals(event.fName, shortName);
    assertEquals(event.fId, cloneId);
    assertEquals(event.fWidth, width);
    return (fNextNetId)++;
}