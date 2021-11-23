@org.junit.Test
public void testIsPresentInMDRList() {
    boolean result = fact.isPresentInMDRList("GEAR_TYPE", "LA");
    assertEquals(true, result);
}