@org.junit.Test
public void readGraphWithPropertiesOnly() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString(java.lang.String.format("%s[()]", org.s1ck.gdl.GDLLoaderTest.PROPERTIES_STRING));
    validateCollectionSizes(loader, 1, 1, 0);
    validateCacheSizes(loader, 0, 0, 0);
    validateProperties(loader.getGraphs().iterator().next());
}