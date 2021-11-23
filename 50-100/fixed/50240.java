public void testReadOnlyAndWriteOnly() throws java.lang.Exception {
    java.lang.String json = MAPPER.writeValueAsString(new com.fasterxml.jackson.failing.ReadWriteOnlyProp935Test.ReadXWriteY());
    assertEquals("{\"x\":1}", json);
    com.fasterxml.jackson.failing.ReadWriteOnlyProp935Test.ReadXWriteY result = MAPPER.readValue("{\"x\":5, \"y\":6}", com.fasterxml.jackson.failing.ReadWriteOnlyProp935Test.ReadXWriteY.class);
    assertNotNull(result);
    assertEquals(1, result.x);
    assertEquals(6, result.y);
}