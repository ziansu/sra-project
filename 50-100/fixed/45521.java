protected java.security.Key getKeyByType(com.xiaoleilu.hutool.crypto.asymmetric.KeyType type) {
    switch (type) {
        case PrivateKey :
            if (null == (this.privateKey)) {
                throw new java.lang.NullPointerException("Private key must not null when use it !");
            }
            return this.privateKey;
        case PublicKey :
            if (null == (this.publicKey)) {
                throw new java.lang.NullPointerException("Public key must not null when use it !");
            }
            return this.publicKey;
    }
    throw new com.xiaoleilu.hutool.crypto.CryptoException(("Uknown key type: " + type));
}