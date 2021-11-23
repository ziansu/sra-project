@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testConstructorWithByteArrayAlgorithmNull3() {
    gq.baijie.catalog.entity.Hash hash = new gq.baijie.catalog.entity.Hash(null, null);
}