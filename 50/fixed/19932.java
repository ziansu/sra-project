@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testConstructorWithByteArrayAlgorithmConsistent3() {
    gq.baijie.catalog.entity.Hash hash = new gq.baijie.catalog.entity.Hash(gq.baijie.catalog.util.HEX.hexToBytes(("00" + (gq.baijie.catalog.entity.HashTest.SHA256_HEX))), Hash.Algorithm.SHA256);
    java.lang.System.out.println(hash);
}