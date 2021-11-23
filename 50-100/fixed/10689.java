private void saveIntegrityKey(javax.crypto.SecretKey secretKey, java.lang.String integrityKeyFilename) {
    try (java.io.ObjectOutputStream integrityKeyOutputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream(integrityKeyFilename))) {
        integrityKeyOutputStream.writeObject(secretKey);
        integrityKeyOutputStream.close();
        consoleOutputController.logOnScreen(java.lang.String.format(keySavedMessage, integrityKeyFilename));
    } catch (java.io.IOException e) {
        throw new ch.ge.ve.offlineadmin.exception.KeyGenerationRuntimeException("error while saving the integrity key", e);
    }
}