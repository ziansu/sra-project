public void sendEncrypted(byte[] data, javax.crypto.SecretKey key, java.lang.String mode) {
    byte[] toSend = addTimestamp(data);
    byte[] encrypted = pt.ulisboa.ist.sirs.project.securesmarthome.Cryptography.encrypt(toSend, key, mode);
    try {
        commChannel.sendMessage(encrypted);
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    }
}