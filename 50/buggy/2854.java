@org.junit.Test
public void testFormat() {
    java.lang.System.out.println("format");
    java.lang.String result = instance.format(record);
    assertEquals(fullLogMessage, result);
}