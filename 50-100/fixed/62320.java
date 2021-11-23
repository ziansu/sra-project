public static de.die_beckerei.keditor.app.crypto.cipher.Cipher getInstance(de.die_beckerei.keditor.app.crypto.cipher.Cipher.TYPE ciphertype, de.die_beckerei.keditor.app.crypto.CipherSettings settings) throws java.lang.Exception {
    de.die_beckerei.keditor.app.crypto.cipher.types.Algorithm usedAlgo = de.die_beckerei.keditor.app.crypto.CipherFactory.determineAlgorithm(ciphertype, settings);
    switch (ciphertype) {
        case AES :
            return new de.die_beckerei.keditor.app.crypto.cipher.AES(usedAlgo, settings);
        case DES :
            return new de.die_beckerei.keditor.app.crypto.cipher.DES(new de.die_beckerei.keditor.app.crypto.cipher.types.AlgoDES(), settings);
        default :
            return null;
    }
}