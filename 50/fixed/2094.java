@org.junit.Before
public void initialize() {
    this.edDSAPrivateKey = nl.tudelft.b_b_w.controller.ED25519.generatePrivateKey();
    this.edDSAPublicKey = nl.tudelft.b_b_w.controller.ED25519.getPublicKey(this.edDSAPrivateKey);
}