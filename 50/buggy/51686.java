final java.lang.String publicKeyToString(net.i2p.crypto.eddsa.EdDSAPublicKey publicKey) {
    java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(publicKey.getEncoded());
    return net.i2p.crypto.eddsa.Utils.bytesToHex(x509EncodedKeySpec.getEncoded());
}