@org.junit.Test
public void readVertexTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString("()");
    validateCollectionSizes(loader, 0, 1, 0);
    validateCacheSizes(loader, 0, 1, 0);
    java.util.Optional<org.s1ck.gdl.model.Vertex> vertex = loader.getVertices().stream().findFirst();
    assertTrue(vertex.isPresent());
    assertEquals(loader.getDefaultVertexLabel(), vertex.get().getLabel());
}