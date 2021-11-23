@org.junit.Test
public void readGraphWithVariableTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString("g[()]");
    validateCollectionSizes(loader, 1, 1, 0);
    validateCacheSizes(loader, 1, 1, 0);
    assertTrue("graph not cached", loader.getGraphCache().containsKey("g"));
    org.s1ck.gdl.model.Graph g = loader.getGraphCache().get("g");
    assertNotNull("graph was null", g);
    assertEquals(loader.getDefaultGraphLabel(), g.getLabel());
}