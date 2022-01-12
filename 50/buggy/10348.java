public java.lang.String readValue(java.lang.String string) {
    return isDbEncrypted ? encryptionManager.getDecrypted(string) : string;
}