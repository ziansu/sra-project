public void init(Encryption.AdHoPuK.Cipher mode, Encryption.ObjectKey key) {
    if (mode == (Encryption.AdHoPuK.Cipher.ENCRYPT_MODE)) {
        encryption = true;
        pubK = ((Encryption.HomomorphicPublicKey) (key));
    }else
        if (mode == (Encryption.AdHoPuK.Cipher.DECRYPT_MODE)) {
            decryption = true;
            privK = ((Encryption.HomomorphicPrivateKey) (key));
        }
    
}