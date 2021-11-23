@org.junit.Test
public void readGraphWithPropertiesTest() {
    org.s1ck.gdl.GDLLoader loader = getLoaderFromGDLString(java.lang.String.format("g%s[()]", org.s1ck.gdl.GDLLoaderTest.PROPERTIES_STRING));
    validateCollectionSizes(loader, 1, 1, 0);
    validateCacheSizes(loader, 1, 1, 0);
    validateProperties(loader.getGraphCache().get("g"));
}