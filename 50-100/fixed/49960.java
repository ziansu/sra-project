public void newDevice(java.lang.String name) {
    this.name = name;
    java.security.KeyPair keyPair = new net.i2p.crypto.eddsa.KeyPairGenerator().generateKeyPair();
    seed = ((net.i2p.crypto.eddsa.EdDSAPrivateKey) (keyPair.getPrivate())).getSeed();
    proposed = new com.epfl.dedis.net.Config(config);
    proposed.getDeviceB64().put(name, com.epfl.dedis.crypto.Ed25519.PubString(keyPair.getPublic()));
}