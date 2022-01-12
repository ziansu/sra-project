public java.util.Optional<java.security.Key> keyForAlgorithmAtBits(java.lang.String algorithm, java.lang.Integer bits) {
    java.util.Optional<java.security.Key> result = java.util.Optional.empty();
    try {
        javax.crypto.KeyGenerator generator = javax.crypto.KeyGenerator.getInstance("AES");
        generator.init(bits, this.random);
        java.security.Key key = generator.generateKey();
        result = java.util.Optional.of(key);
    } catch (java.security.NoSuchAlgorithmException e) {
        com.jrfom.crypto.KeyTool.log.error("Could not find algorithm: `{}`", algorithm);
        com.jrfom.crypto.KeyTool.log.debug(e.toString());
    }
    return result;
}