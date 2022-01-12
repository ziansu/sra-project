@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testIllegalIndex() {
    kuzzle.setSuperDefaultIndex(null);
    kuzzle.dataCollectionFactory(null, "collection");
}