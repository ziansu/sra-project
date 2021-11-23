@java.lang.Override
public byte[] encrypt(char[] password, byte[] secret) throws java.security.GeneralSecurityException {
    return pw.itr0.kaba.encrypt.PBE.getCipher(javax.crypto.Cipher.ENCRYPT_MODE, password, this.salt, this.iterationCount).doFinal(secret);
}