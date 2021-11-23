@org.junit.Test
public void testCompletionParsing() throws java.lang.Exception {
    java.util.Map value = new org.codehaus.jackson.map.ObjectMapper().readValue(getClass().getResourceAsStream("completion.json"), java.util.Map.class);
    org.elasticsearch.hadoop.serialization.dto.mapping.Field fl = org.elasticsearch.hadoop.serialization.dto.mapping.Field.parseField(value);
    assertEquals("song", fl.name());
    org.elasticsearch.hadoop.serialization.dto.mapping.Field[] props = fl.properties();
    assertEquals(1, props.length);
    assertEquals("name", props[0].name());
}