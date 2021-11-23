public void init(Encryption.AdHoPuK.Cipher mode, Encryption.ObjectKey key) {
    if (mode == (Encryption.AdHoPuK.Cipher.ENCRYPT_MODE)) {
        encryption = true;
        privK = ((Encryption.HomomorphicPrivateKey) (key));
    }else
        if (mode == (Encryption.AdHoPuK.Cipher.DECRYPT_MODE)) {
            decryption = true;
            pubK = ((Encryption.HomomorphicPublicKey) (key));
        }
    
}