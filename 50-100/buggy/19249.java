@org.junit.Test
public void readEdgeTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString("()-->()");
    validateCollectionSizes(loader, 0, 2, 1);
    validateCacheSizes(loader, 0, 2, 1);
    java.util.Optional<org.s1ck.gdl.model.Edge> edge = loader.getEdges().stream().findFirst();
    assertTrue(edge.isPresent());
    assertEquals("edge has wrong label", loader.getDefaultEdgeLabel(), edge.get().getLabel());
}