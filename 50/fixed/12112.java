@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConstructorWithByteArrayErrorValue1() {
    gq.baijie.catalog.entity.Hash hash = new gq.baijie.catalog.entity.Hash(gq.baijie.catalog.util.HEX.hexToBytes(("00" + (gq.baijie.catalog.entity.HashTest.MD5_HEX))));
    java.lang.System.out.println(hash);
}