@org.junit.Test
public void digestBySHA512() {
    core.framework.api.crypto.HMAC hmac = new core.framework.api.crypto.HMAC(core.framework.api.util.Strings.bytes("4VPDEtyUE"), HMAC.Hash.SHA512);
    byte[] bytes = hmac.digest(core.framework.api.util.Strings.bytes("hello"));
    org.junit.Assert.assertNotNull(bytes);
}