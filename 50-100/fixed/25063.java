@org.junit.Test
public void testDataRetrieve() {
    org.junit.Assert.assertEquals("Feature", this.feature.getName());
    org.junit.Assert.assertEquals("Value1", this.feature.getValues().get(0));
    org.junit.Assert.assertEquals("Value2", this.feature.getValues().get(1));
}