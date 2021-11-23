@org.junit.Test
public void testValuesSize() {
    java.lang.Integer quantity = 2;
    org.junit.Assert.assertEquals(quantity, this.feature.getNumberOfValues());
}