@org.junit.Test
public void testInvert() throws com.implemica.zavizionov.calculator.exception.NoOperationException, java.lang.Exception {
    assertOperation(10, Operation.INVERT, (-10));
    assertOperation(15.13, Operation.INVERT, (-15.13));
    assertOperation("0.000000000000001", Operation.INVERT, "-0.000000000000001");
    assertOperation("10000000000", Operation.INVERT, "-10000000000");
    assertOperation("99999999999999999999", Operation.INVERT, "-99999999999999999999");
}