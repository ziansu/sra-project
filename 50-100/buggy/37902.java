@org.junit.Test
public void testCompletionParsing() throws java.lang.Exception {
    java.util.Map value = new org.codehaus.jackson.map.ObjectMapper().readValue(getClass().getResourceAsStream("completion.json"), java.util.Map.class);
    org.elasticsearch.hadoop.serialization.dto.mapping.Field fl = org.elasticsearch.hadoop.serialization.dto.mapping.Field.parseField(value);
    org.junit.Assert.assertEquals("song", fl.name());
    org.elasticsearch.hadoop.serialization.dto.mapping.Field[] props = fl.properties();
    org.junit.Assert.assertEquals(1, props.length);
    org.junit.Assert.assertEquals("name", props[0].name());
}