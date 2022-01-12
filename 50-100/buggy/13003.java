public void connect() throws java.io.IOException, java.lang.ClassNotFoundException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, rsa.exceptions.GeneratingPublicKeyException {
    conn = new network.Connection();
    if ((thread) == null) {
        thread = new java.lang.Thread(this);
        thread.setDaemon(true);
        thread.start();
    }
}