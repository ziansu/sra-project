@org.junit.Test
public void readGraphWithLabelTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString("g:Label[()]");
    validateCollectionSizes(loader, 1, 1, 0);
    validateCacheSizes(loader, 1, 1, 0);
    org.s1ck.gdl.model.Graph g = loader.getGraphCache().get("g");
    assertEquals("graph has wrong label", "Label", g.getLabel());
}