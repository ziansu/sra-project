@org.junit.Test
public void testConstructor() {
    eu.qualimaster.manifestUtils.data.Field field = new eu.qualimaster.manifestUtils.data.Field("Test", eu.qualimaster.manifestUtils.data.FieldType.INTEGER, FieldType.INTEGER.name());
    org.junit.Assert.assertEquals(field.getName(), "Test");
    org.junit.Assert.assertEquals(field.getFieldType(), FieldType.INTEGER);
}