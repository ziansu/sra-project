public byte[] sha512(byte[] message) {
    org.abstractj.kalium.crypto.Hash.buffer = new byte[org.abstractj.kalium.SodiumConstants.SHA512BYTES];
    org.abstractj.kalium.NaCl.sodium().crypto_hash_sha512(org.abstractj.kalium.crypto.Hash.buffer, message, message.length);
    return org.abstractj.kalium.crypto.Hash.buffer;
}