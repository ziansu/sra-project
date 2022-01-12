@org.junit.Test
public void testDataRetrieve() {
    java.lang.String value1 = "Value1";
    java.lang.String value2 = "Value2";
    java.lang.String name = "Feature";
    org.junit.Assert.assertEquals(name, this.feature.getName());
    org.junit.Assert.assertEquals(value1, this.feature.getValues().get(0));
    org.junit.Assert.assertEquals(value2, this.feature.getValues().get(1));
}