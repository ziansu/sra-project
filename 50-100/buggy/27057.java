@org.junit.Test
public void testNullValueInCell() {
    java.lang.String cfgJson = "{source: { content: { value: \'id,postId,text\n1,NULL,Hello\'} }, extractor : { row : {} }, transformers : [{ csv : {nullValue: \'NULL\'} }], loader : { test: {} } }";
    process(cfgJson);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> res = getResult();
    com.orientechnologies.orient.core.record.impl.ODocument doc = res.get(0);
    assertEquals(new java.lang.Integer(1), ((java.lang.Integer) (doc.field("id"))));
    assertNull(((java.lang.Integer) (doc.field("postId"))));
    assertEquals("Hello", ((java.lang.String) (doc.field("text"))));
}