public java.lang.String readValueB64(java.lang.String string) {
    if (string == null) {
        return null;
    }
    return isDbEncrypted ? encryptionManager.getDecryptedB64(string) : new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64(string));
}