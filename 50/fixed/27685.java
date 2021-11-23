@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testConstructorWithByteArrayNull() {
    gq.baijie.catalog.entity.Hash hash = new gq.baijie.catalog.entity.Hash(null);
    java.lang.System.out.println(hash);
}