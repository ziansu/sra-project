@org.junit.jupiter.api.Test
void testMultipleMarginalized() {
    double[] gd_marginalized = new double[]{ 0.6 , 0.4 };
    discreteFactor.marginalize(new java.lang.String[]{ "D" , "G" }, true);
    org.junit.jupiter.api.Assertions.assertArrayEquals(new java.lang.String[]{ "I" }, discreteFactor.getScope());
    org.junit.jupiter.api.Assertions.assertArrayEquals(new int[]{ 2 }, discreteFactor.getCardinality());
    org.junit.jupiter.api.Assertions.assertArrayEquals(gd_marginalized, discreteFactor.values, threshold);
}