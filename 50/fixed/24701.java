@org.junit.Test
public void testGetDataTypeForMDRList() {
    java.lang.String result = fact.getDataTypeForMDRList("FA_GEAR_CHARACTERISTIC", "ME");
    assertEquals("MEASURE", result);
}