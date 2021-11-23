public byte[] sha512(byte[] message) {
    byte[] buffer = new byte[org.abstractj.kalium.SodiumConstants.SHA512BYTES];
    org.abstractj.kalium.NaCl.sodium().crypto_hash_sha512(buffer, message, message.length);
    return buffer;
}