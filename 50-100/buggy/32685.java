@org.junit.jupiter.api.Test
void testMarginalize() {
    double[] g_marginalized = new double[]{ 0.42 , 0.18 , 0.28 , 0.12 };
    discreteFactor.marginalize(new java.lang.String[]{ "G" }, true);
    org.junit.jupiter.api.Assertions.assertArrayEquals(new java.lang.String[]{ "I" , "D" }, discreteFactor.getScope());
    org.junit.jupiter.api.Assertions.assertArrayEquals(new int[]{ 2 , 2 }, discreteFactor.getCardinality());
    org.junit.jupiter.api.Assertions.assertArrayEquals(g_marginalized, discreteFactor.getValues(), threshold);
}