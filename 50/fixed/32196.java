@org.junit.Test(expected = com.ciderref.sdk.math.NotInvertibleException.class)
public void testInverseOfZero() {
    new com.ciderref.sdk.math.ConversionFactorFunction(0.0).getInverse();
}