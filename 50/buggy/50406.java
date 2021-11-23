@org.junit.Test
public void testParseDateTime_unknownFormat() {
    org.junit.Assert.assertNull(com.google.cloud.tools.intellij.debugger.BreakpointUtil.parseDateTime("this is not a date"));
}