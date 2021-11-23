@org.junit.Test
public void testGeolocationParsing() throws java.lang.Exception {
    java.util.Map value = new org.codehaus.jackson.map.ObjectMapper().readValue(getClass().getResourceAsStream("geo.json"), java.util.Map.class);
    org.elasticsearch.hadoop.serialization.dto.mapping.Field fl = org.elasticsearch.hadoop.serialization.dto.mapping.Field.parseField(value);
    org.junit.Assert.assertEquals(1, fl.properties().length);
}