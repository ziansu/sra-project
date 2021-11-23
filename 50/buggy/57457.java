@org.junit.Test
public void testConvertRand() {
    java.lang.String result = org.teamninjaneer.simulator.locationsimulator.converter.FunctionConverter.convertRand();
    assertNotNull(result);
    java.lang.Integer intResult = java.lang.Integer.valueOf(result);
    assertTrue((intResult > 0));
}