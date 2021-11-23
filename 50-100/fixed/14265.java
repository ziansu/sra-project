public static peergos.shared.Crypto initJava() {
    peergos.shared.SafeRandom.Java random = new peergos.shared.SafeRandom.Java();
    peergos.shared.Salsa20Poly1305.Java symmetricProvider = new peergos.shared.Salsa20Poly1305.Java();
    peergos.shared.JavaEd25519 signer = new peergos.shared.JavaEd25519();
    peergos.shared.JavaCurve25519 boxer = new peergos.shared.JavaCurve25519();
    return peergos.shared.Crypto.init(() -> new peergos.shared.Crypto(random, new peergos.shared.ScryptJava(), symmetricProvider, signer, boxer), true);
}