public void testDeSerFail() throws java.io.IOException {
    com.fasterxml.jackson.databind.deser.ObjectMapper mapper = new com.fasterxml.jackson.databind.deser.ObjectMapper();
    com.fasterxml.jackson.databind.deser.TestPolymorphicDeserialization676.MapContainer deserMapBad = com.fasterxml.jackson.databind.deser.TestPolymorphicDeserialization676.createDeSerMapContainer(originMap, mapper);
    java.util.List<java.lang.Object> list = java.util.Arrays.asList(new java.lang.Object[]{ "java.util.Date" , com.fasterxml.jackson.databind.deser.TestPolymorphicDeserialization676.TIMESTAMP });
    assertEquals(list, deserMapBad.map.get("DateValue"));
    assertEquals(originMap, deserMapBad);
    assertEquals(originMap, mapper.readValue(mapper.writeValueAsString(originMap), com.fasterxml.jackson.databind.deser.TestPolymorphicDeserialization676.MapContainer.class));
}