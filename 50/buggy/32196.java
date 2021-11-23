@org.junit.Test
public void testInverseOfZero() {
    double numerator = 0.0;
    org.junit.Assert.assertEquals(0, new com.ciderref.sdk.math.ConversionFactorFunction(numerator).getInverse().getNumerator(), 0);
}