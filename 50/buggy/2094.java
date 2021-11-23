@org.junit.Before
public void initialize() {
    this.keyReader = new nl.tudelft.b_b_w.controller.KeyReader();
    this.keyWriter = new nl.tudelft.b_b_w.controller.KeyWriter();
    this.edDSAPrivateKey = nl.tudelft.b_b_w.controller.ED25519.generatePrivateKey();
    this.edDSAPublicKey = nl.tudelft.b_b_w.controller.ED25519.getPublicKey(this.edDSAPrivateKey);
}