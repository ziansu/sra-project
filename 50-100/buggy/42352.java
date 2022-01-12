@org.testng.annotations.Test
public void testKeepFieldType() throws java.lang.Exception {
    com.orientechnologies.orient.core.record.impl.ODocument doc = new com.orientechnologies.orient.core.record.impl.ODocument();
    doc.field("integer", 10, OType.INTEGER);
    doc.field("string", 20, OType.STRING);
    doc.field("binary", new byte[]{ 30 }, OType.BINARY);
    org.testng.Assert.assertEquals(doc.fieldType("integer"), OType.INTEGER);
    org.testng.Assert.assertEquals(doc.fieldType("string"), OType.STRING);
    org.testng.Assert.assertEquals(doc.fieldType("binary"), OType.BINARY);
}