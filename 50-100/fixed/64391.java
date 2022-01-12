@org.junit.Test
public void testUnsupportedParsing() throws java.lang.Exception {
    java.util.Map value = new org.codehaus.jackson.map.ObjectMapper().readValue(getClass().getResourceAsStream("attachment.json"), java.util.Map.class);
    org.elasticsearch.hadoop.serialization.dto.mapping.Field fl = org.elasticsearch.hadoop.serialization.dto.mapping.Field.parseField(value);
    assertEquals("person", fl.name());
    assertEquals(0, fl.properties().length);
}