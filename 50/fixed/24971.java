@org.junit.Test
public void testGetDataTypeForMDRListNullCheck() {
    java.lang.String result = fact.getDataTypeForMDRList("TEST", null);
    assertEquals("", result);
}