public void testDeSerFail() throws java.io.IOException {
    com.fasterxml.jackson.databind.deser.ObjectMapper mapper = new com.fasterxml.jackson.databind.deser.ObjectMapper();
    com.fasterxml.jackson.databind.deser.TestPolymorphicDeserialization676.MapContainer deserMapBad = createDeSerMapContainer(originMap, mapper);
    assertEquals(originMap, deserMapBad);
    assertEquals(originMap, mapper.readValue(mapper.writeValueAsString(originMap), com.fasterxml.jackson.databind.deser.TestPolymorphicDeserialization676.MapContainer.class));
}