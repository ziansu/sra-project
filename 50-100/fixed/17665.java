@org.junit.Test
public void testConstructorWithByteArrayAlgorithm() {
    gq.baijie.catalog.entity.Hash hash;
    hash = new gq.baijie.catalog.entity.Hash(gq.baijie.catalog.util.HEX.hexToBytes(gq.baijie.catalog.entity.HashTest.MD5_HEX), Hash.Algorithm.MD5);
    java.lang.System.out.println(hash);
    hash = new gq.baijie.catalog.entity.Hash(gq.baijie.catalog.util.HEX.hexToBytes(gq.baijie.catalog.entity.HashTest.SHA1_HEX), Hash.Algorithm.SHA1);
    java.lang.System.out.println(hash);
    hash = new gq.baijie.catalog.entity.Hash(gq.baijie.catalog.util.HEX.hexToBytes(gq.baijie.catalog.entity.HashTest.SHA256_HEX), Hash.Algorithm.SHA256);
    java.lang.System.out.println(hash);
}