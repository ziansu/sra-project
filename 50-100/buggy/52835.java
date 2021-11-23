byte[] hkdfExtract(byte[] inputKeyingMaterial, byte[] salt) {
    if (salt == null) {
        salt = new byte[macFactory.macHashLengthByte()];
    }
    if ((inputKeyingMaterial == null) || ((inputKeyingMaterial.length) <= 0)) {
        throw new java.lang.IllegalArgumentException("provided inputKeyingMaterial must be at least of size 1 and not null");
    }
    return at.favre.crypto.HKDF.hmacDigest(inputKeyingMaterial, macFactory.createMacInstance(salt));
}