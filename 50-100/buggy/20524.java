@java.lang.Override
public void loadUserData(java.lang.String username, long connectionId, com.bolyartech.scram_sasl.server.ScramSaslServerProcessor processor) {
    java.security.SecureRandom random = new java.security.SecureRandom();
    byte[] salt = new byte[24];
    random.nextBytes(salt);
    try {
        com.bolyartech.scram_sasl.common.ScramUtils.NewPasswordStringData data = com.bolyartech.scram_sasl.common.ScramUtils.byteArrayToStringData(com.bolyartech.scram_sasl.common.ScramUtils.newPassword("ogre1234", salt, 4096, "HmacSHA256", "SHA-256"));
        processor.onUserDataLoaded(new com.bolyartech.scram_sasl.server.UserData(data.salt, data.iterations, data.serverKey, data.storedKey));
    } catch (java.security.NoSuchAlgorithmException | java.security.InvalidKeyException e) {
        e.printStackTrace();
    }
}